package personal.chencs.composite;

/**
 * 目录条目：定义接口
 * 实现容器和内容的一致性
 *
 * @author: chencs
 * @date: 2018/10/19
 */
public interface Entry {

    String getName();

    int getSize();

    void printList(String prefix);

    void add(Entry entry);

}
