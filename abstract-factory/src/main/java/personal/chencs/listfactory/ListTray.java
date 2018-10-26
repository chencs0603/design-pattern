package personal.chencs.listfactory;

import personal.chencs.factory.Item;
import personal.chencs.factory.Tray;

/**
 * 具体零件
 *
 * @author: chencs
 * @date: 2018/10/25
 */
public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n");
        buffer.append(this.caption + "\n");
        buffer.append("<ul>\n");
        for(int i = 0; i < this.tray.size(); i++) {
            Item item = this.tray.get(i);
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("</li>\n");

        return buffer.toString();
    }
}
