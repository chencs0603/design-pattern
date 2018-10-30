package personal.chencs.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 具体元素类
 *
 * @author: chencs
 * @date: 2018/10/30
 */
public class Directory extends Entry {

    private String name;
    private List<Entry> entryList;

    public Directory(String name) {
        this.name = name;
        this.entryList = new ArrayList<Entry>();
    }

    public void accept(Visitor visitor) {
        visitor.visitor(this);
    }

    public String getName() {
        return this.name;
    }

    public int getSize() {
        int size = 0;
        Iterator iterator = entryList.iterator();
        while (iterator.hasNext()) {
            Entry entry = (Entry) iterator.next();
            size += entry.getSize();
        }
        return size;
    }

    public void add(Entry entry) {
        entryList.add(entry);
    }

    public Iterator iterator() {
        return entryList.iterator();
    }
}
