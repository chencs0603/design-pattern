package personal.chencs.bridge;

/**
 * 委托
 *
 * @author: chencs
 * @date: 2018/10/26
 */
public class DisplayImpl {

    private Display display;

    public DisplayImpl(Display display) {
        this.display = display;
    }

    public void open() {
        this.display.rawOpen();
    }

    public void print() {
        this.display.rawPrint();
    }

    public void close() {
        this.display.rawClose();
    }

    public void display() {
        open();
        print();
        close();
    }
}
