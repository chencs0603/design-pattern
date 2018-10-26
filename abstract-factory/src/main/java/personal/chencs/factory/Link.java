package personal.chencs.factory;

/**
 * 抽象零件：超链接
 *
 * @author: chencs
 * @date: 2018/10/25
 */
public abstract class Link extends Item {

    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
