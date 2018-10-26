package personal.chencs.listfactory;

import personal.chencs.factory.Item;
import personal.chencs.factory.Page;

import java.util.Iterator;

/**
 * 具体零件
 *
 * @author: chencs
 * @date: 2018/10/25
 */
public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>" + this.title + "</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>" + this.title + "</h1>");
        buffer.append("<ul>\n");
        Iterator iterator = this.content.iterator();
        while (iterator.hasNext()) {
            Item item = (Item) iterator.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("<hr><address>" + this.author + "</address>");
        buffer.append("</body></html>\n");

        return buffer.toString();
    }
}
