package personal.chencs.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象零件：托盘，包含多个Link和Tray的容器
 *
 * @author: chencs
 * @date: 2018/10/25
 */
public abstract class Tray extends Item {

    protected List<Item> tray;

    public Tray(String caption) {
        super(caption);
        this.tray = new ArrayList<Item>();
    }

    public void add(Item item) {
        tray.add(item);
    }
}
