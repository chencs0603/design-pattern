package personal.chencs.adapter;

/**
 * 被适配的类：现有功能
 *
 * @author: chencs
 * @date: 2018/10/22
 */
public class Banner {

    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void printWithParen() {
        System.out.println("(" + string + ")");
    }

    public void printWithAster() {
        System.out.println("*" + string + "*");
    }
}
