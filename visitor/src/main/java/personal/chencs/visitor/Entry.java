package personal.chencs.visitor;

import java.util.Iterator;

/**
 *
 *
 * @author: chencs
 * @date: 2018/10/30
 */
public abstract class Entry implements Element {

    public abstract String getName();
    public abstract int getSize();

    public abstract void add(Entry entry);
    public abstract Iterator iterator();

    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}
