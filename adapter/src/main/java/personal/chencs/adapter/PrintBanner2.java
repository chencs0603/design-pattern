package personal.chencs.adapter;

/**
 * 适配器类：实现需要的功能
 * 通过委托实现适配器
 * Java只支持单继承，不能同时继承Banner和Print两个类
 *
 * @author: chencs
 * @date: 2018/10/22
 */
public class PrintBanner2 extends Print {

    private Banner banner;

    public PrintBanner2(String string) {
        this.banner = new Banner(string);
    }

    public void printWeak() {
        banner.printWithParen();
    }

    public void printStrong() {
        banner.printWithAster();
    }
}
