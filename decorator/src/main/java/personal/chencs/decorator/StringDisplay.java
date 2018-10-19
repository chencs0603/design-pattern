package personal.chencs.decorator;

/**
 * 模板方法实现类
 * 实现抽象方法，显示单行字符串
 *
 * @author: chencs
 * @date: 2018/10/19
 */
public class StringDisplay extends Display {

    private String string;

    public StringDisplay(String string) {
        this.string = string;
    }

    public int getRows() {
        return 1;
    }

    public int getColumns() {
        return string.length();
    }

    public String getRowText(int row) {
        if (0 == row) {
            return this.string;
        } else {
            return null;
        }
    }
}
