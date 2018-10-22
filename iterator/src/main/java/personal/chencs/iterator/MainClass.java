package personal.chencs.iterator;

/**
 * @author: chencs
 * @date: 2018/10/22
 */
public class MainClass {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(16);
        bookShelf.append(new Book("Java"));
        bookShelf.append(new Book("C"));
        bookShelf.append(new Book("Python"));
        bookShelf.append(new Book("Go"));

        // 面向接口编程
        Iterator iterator = bookShelf.iterator();

        // 引入Iterator模式的好处：遍历BookShelf的客户端代码不依赖与BookShelf的具体实现
        // 即下面的遍历代码可以复用
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book);
        }
    }
}
