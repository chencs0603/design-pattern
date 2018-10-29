package personal.chencs.bridge;

/**
 * @author: chencs
 * @date: 2018/10/26
 */
public class MainClass {

    public static void main(String[] args) {
        // 类的功能层次和实现层次分离，则增加后的功能可以被所有实现使用
        DisplayImpl display1 = new DisplayImpl(new StringDisplay("Hello China"));
        DisplayImpl display2 = new CountDisplay(new StringDisplay("Hello World"));
        CountDisplay display3 = new CountDisplay(new StringDisplay("Hello chencs"));

        display1.display();
        display2.display();
        display3.display();
        display3.multiDisplay(3);
    }
}
