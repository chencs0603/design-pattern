package personal.chencs.composite;

/**
 * 文件：内容
 *
 * @author: chencs
 * @date: 2018/10/19
 */
public class File extends AbstractEntry {

    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return this.name;
    }

    public int getSize() {
        return this.size;
    }

    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }

    public void add(Entry entry) {
        throw new RuntimeException("不支持add操作");
    }

}
