package personal.chencs.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件夹：容器
 *
 * @author: chencs
 * @date: 2018/10/19
 */
public class Directory extends AbstractEntry {

    private String name;
    // 容器的体现
    private List<Entry> subEntryList;

    public Directory(String name) {
        this.name = name;
        this.subEntryList = new ArrayList<Entry>();
    }

    public String getName() {
        return this.name;
    }

    public int getSize() {
        int size = 0;
        for (Entry entry : subEntryList) {
            // 递归调用、容器与内容的一致性
            size += entry.getSize();
        }
        return size;
    }

    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        for (Entry entry : subEntryList) {
            // 递归调用、容器与内容的一致性
            entry.printList(prefix + "/" + this.name);
        }
    }

    public void add(Entry entry) {
        subEntryList.add(entry);
    }

}
