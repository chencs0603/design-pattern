package personal.chencs.adapter;

/**
 * 适配器类：实现需要的功能
 * 通过继承实现适配器
 *
 * @author: chencs
 * @date: 2018/10/22
 */
public class PrintBanner1 extends Banner implements IPrint {
    public PrintBanner1(String string) {
        super(string);
    }

    public void printWeak() {
        printWithParen();
    }

    public void printStrong() {
        printWithAster();
    }
}
