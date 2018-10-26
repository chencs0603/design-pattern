package personal.chencs.factory;

/**
 * 抽象零件：Link和Item的父类
 *
 * @author: chencs
 * @date: 2018/10/25
 */
public abstract class Item {

    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
