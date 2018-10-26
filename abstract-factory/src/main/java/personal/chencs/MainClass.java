package personal.chencs;

import personal.chencs.factory.Factory;
import personal.chencs.factory.Link;
import personal.chencs.factory.Page;
import personal.chencs.factory.Tray;

/**
 * @author: chencs
 * @date: 2018/10/25
 */
public class MainClass {

    public static void main(String[] args) {
        // 编程过程中没有用到listfactory包中的任何类，通过传入ListFactory类的全限定名生成具体工厂类
        Factory factory = Factory.getFactory("personal.chencs.listfactory.ListFactory");

        Link people = factory.createLink("人民日报", "http://www.people.com.cn/");
        Link gmw = factory.createLink("光明日报", "http://www.gmw.cn/");

        Link usYahoo = factory.createLink("Yahoo", "http://www.yahoo.com/");
        Link jpYahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.com/jp");
        Link excite = factory.createLink("Excite", "http://www.excite.com/");
        Link google = factory.createLink("Google", "http://www.google.com/");

        Tray trayNews = factory.createTray("日报");
        trayNews.add(people);
        trayNews.add(gmw);

        Tray trayYahoo = factory.createTray("Yahoo!");
        trayYahoo.add(usYahoo);
        trayYahoo.add(jpYahoo);

        Tray traySearch = factory.createTray("搜索引擎");
        traySearch.add(trayYahoo);
        traySearch.add(excite);
        traySearch.add(google);

        Page page = factory.createPage("LinkPage", "chencs");
        page.add(trayNews);
        page.add(traySearch);

        page.output();
    }
}
