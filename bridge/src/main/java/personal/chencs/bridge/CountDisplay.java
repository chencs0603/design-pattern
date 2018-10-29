package personal.chencs.bridge;

/**
 * 类的功能层次扩展
 *
 * @author: chencs
 * @date: 2018/10/26
 */
public class CountDisplay extends DisplayImpl {
    public CountDisplay(Display impl) {
        super(impl);
    }

    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
