package personal.chencs.iterator;

/**
 * Aggregate的实现类：书架
 * 书的集合
 *
 * @author: chencs
 * @date: 2018/10/22
 */
public class BookShelf implements Aggregate {

    private Book[] books;
    private int num;

    public BookShelf(int capacity) {
        this.books = new Book[capacity];
        this.num = 0;
    }

    public void append(Book book) {
        this.books[num] = book;
        this.num++;
    }

    public Book getBookAt(int index) {
        return this.books[index];
    }

    public int getSize() {
        return this.num;
    }

    public Iterator iterator() {
        return new BookIterator(this);
    }
}
