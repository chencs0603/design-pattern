package personal.chencs.visitor;

import java.util.Iterator;

/**
 * 具体元素类
 *
 * @author: chencs
 * @date: 2018/10/30
 */
public class File extends Entry {

    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void accept(Visitor visitor) {
        visitor.visitor(this);
    }

    public String getName() {
        return this.name;
    }

    public int getSize() {
        return this.size;
    }

    public void add(Entry entry) {
        throw new UnsupportedOperationException();
    }

    public Iterator iterator() {
        throw new UnsupportedOperationException();
    }
}
