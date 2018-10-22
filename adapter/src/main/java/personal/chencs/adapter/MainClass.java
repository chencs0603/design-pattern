package personal.chencs.adapter;

/**
 * @author: chencs
 * @date: 2018/10/22
 */
public class MainClass {

    public static void main(String[] args) {
        // 客户端代码只需要使用Print的功能，所以使用Print接口进行编程
        // Banner类及其方法完全被隐藏起来
        IPrint print1 = new PrintBanner1("hello world");
        print1.printWeak();
        print1.printStrong();

        Print print2 = new PrintBanner2("hello world");
        print2.printWeak();
        print2.printStrong();
    }
}
