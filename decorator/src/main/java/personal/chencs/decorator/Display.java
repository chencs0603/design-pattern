package personal.chencs.decorator;

/**
 * 抽象类：显示字符串
 *
 * @author: chencs
 * @date: 2018/10/19
 */
public abstract class Display {

    public abstract int getRows();

    public abstract int getColumns();

    public abstract String getRowText(int row);

    public final void show() {
        // Template Method模式
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
