package personal.chencs.listfactory;

import personal.chencs.factory.Link;

/**
 * 具体零件
 *
 * @author: chencs
 * @date: 2018/10/25
 */
public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    public String makeHTML() {
        return "<li><a href=\"" + this.url + "\">" + this.caption + "</a></li>\n";
    }
}
