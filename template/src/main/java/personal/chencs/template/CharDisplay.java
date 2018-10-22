package personal.chencs.template;

/**
 * 实现类
 * 实现具体处理
 *
 * @author: chencs
 * @date: 2018/10/22
 */
public class CharDisplay extends AbstractDisplay {

    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    public void open() {
        System.out.print("<<");
    }

    public void print() {
        System.out.print(ch);
    }

    public void close() {
        System.out.println(">>");
    }
}
