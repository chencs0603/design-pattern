package personal.chencs.decorator;

/**
 * @author: chencs
 * @date: 2018/10/19
 */
public class MainClass {

    public static void main(String[] args) {
        Display stringDisplay = new StringDisplay("hello world");
        Display sideBorder = new SideBorder('|', stringDisplay);
        Display fullBorder = new FullBorder(stringDisplay);

        stringDisplay.show();
        sideBorder.show();
        fullBorder.show();
        new FullBorder(sideBorder).show();
    }
}
