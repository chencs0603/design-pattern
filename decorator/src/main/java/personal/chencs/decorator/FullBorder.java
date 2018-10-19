package personal.chencs.decorator;

/**
 * 装饰类:
 * extends Display表示装饰类与被装饰类有相同的接口
 * 即装饰类与被装饰类具有一致性
 * 使用委托，在改变接口的情况下增加功能
 *
 * @author: chencs
 * @date: 2018/10/19
 */
public class FullBorder extends Display {
    // 被装饰类
    private Display display;

    public FullBorder(Display display) {
        this.display = display;
    }

    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    // 具体装饰逻辑
    public String getRowText(int row) {
        if (0 == row || 1 + display.getRows() == row) {
            // 加上上下边框
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else {
            // 加上左右边框
            return "|" + display.getRowText(row - 1) + "|";
        }
    }

    // 工具方法
    private String makeLine(char ch, int count) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buffer.append(ch);
        }

        return buffer.toString();
    }

}
