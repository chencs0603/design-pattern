package personal.chencs.template;

/**
 * 实现类
 * 实现具体处理
 *
 * @author: chencs
 * @date: 2018/10/22
 */
public class StringDisplay extends AbstractDisplay {

    private String string;

    public StringDisplay(String string) {
        this.string = string;
    }

    public void open() {
        printLine();
    }

    public void print() {
        System.out.println("|" + string + "|");
    }

    public void close() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < string.length(); i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
