package personal.chencs.decorator;

/**
 * 装饰类：
 * extends Display表示装饰类与被装饰类有相同的接口
 * 即装饰类与被装饰类具有一致性
 * 使用委托，在改变接口的情况下增加功能
 *
 * @author: chencs
 * @date: 2018/10/19
 */
public class SideBorder extends Display {

    private char borderChar;
    // 被装饰类
    private Display display;

    // 任何Display的实现类都可以作为被装饰类
    public SideBorder(char borderChar, Display display) {
        this.borderChar = borderChar;
        this.display = display;
    }

    public int getRows() {
        return display.getRows();
    }

    public int getColumns() {
        return 1+ display.getColumns() + 1;
    }

    // 具体装饰逻辑
    public String getRowText(int row) {
        // 加上左右边框
        return borderChar + display.getRowText(row) + borderChar;
    }
}
