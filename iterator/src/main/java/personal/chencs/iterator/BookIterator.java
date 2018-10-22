package personal.chencs.iterator;

/**
 * 迭代器的实现类
 *
 * @author: chencs
 * @date: 2018/10/22
 */
public class BookIterator implements Iterator {

    private BookShelf bookShelf;
    // 当前指针，要结合hasNext和next方法来观察index的变化
    // index的合法范围是0-size-1，但实际的变化返回范围是0-size
    private int index;

    public BookIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    // 确认是否可以调用next方法
    // index = size时，返回false
    public boolean hasNext() {
        if (index < bookShelf.getSize()) {
            return true;
        } else {
            return false;
        }
    }

    // 返回当前元素并指向下一个元素
    // 返回最后一个元素后，index = size
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;

        return book;
    }
}
