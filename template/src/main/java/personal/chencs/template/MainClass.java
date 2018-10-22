package personal.chencs.template;

/**
 * @author: chencs
 * @date: 2018/10/22
 */
public class MainClass {

    public static void main(String[] args) {
        AbstractDisplay display1 = new CharDisplay('H');
        AbstractDisplay display2 = new StringDisplay("hello world");
        AbstractDisplay display3 = new StringDisplay("你好，世界");

        display1.display();
        display2.display();
        display3.display();
    }
}
