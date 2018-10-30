package personal.chencs.visitor;

/**
 * 被访问的对象
 *
 * @author: chencs
 * @date: 2018/10/30
 */
public interface Element {

    public void accept(Visitor visitor);

}
