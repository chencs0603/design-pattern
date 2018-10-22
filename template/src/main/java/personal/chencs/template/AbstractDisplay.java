package personal.chencs.template;

/**
 * 抽象类：定义模板方法
 * 定义处理流程的框架
 *
 * @author: chencs
 * @date: 2018/10/22
 */
public abstract class AbstractDisplay {

    public abstract void open();

    public abstract void print();

    public abstract void close();

    // 通用处理流程
    // final表示子类不能重写display方法
    public final void display() {
        open();

        for (int i = 0; i < 5; i++) {
            print();
        }

        close();
    }
}
