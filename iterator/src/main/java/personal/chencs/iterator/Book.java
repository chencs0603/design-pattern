package personal.chencs.iterator;

/**
 * 书：遍历的元素类型
 *
 * @author: chencs
 * @date: 2018/10/22
 */
public class Book {

    private String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
