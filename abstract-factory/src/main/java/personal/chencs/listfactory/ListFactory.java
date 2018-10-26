package personal.chencs.listfactory;

import personal.chencs.factory.Factory;
import personal.chencs.factory.Link;
import personal.chencs.factory.Page;
import personal.chencs.factory.Tray;

/**
 * 具体工厂
 * 增加具体工厂类和零件类时，不需要修改factory包和MainClass类的内容
 *
 * @author: chencs
 * @date: 2018/10/25
 */
public class ListFactory extends Factory {
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
