package personal.chencs.bridge;

/**
 * 类的实现层次扩展
 *
 * @author: chencs
 * @date: 2018/10/26
 */
public class StringDisplay implements Display {

    private String string;

    public StringDisplay(String string) {
        this.string = string;
    }

    public void rawOpen() {
        printLine();
    }

    public void rawPrint() {
        System.out.println("|" + this.string + "|");
    }

    public void rawClose() {
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
