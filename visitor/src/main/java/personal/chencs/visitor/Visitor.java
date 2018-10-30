package personal.chencs.visitor;

/**
 * 访问者：对元素的处理
 *
 * @author: chencs
 * @date: 2018/10/30
 */
public abstract class Visitor {

    // 处理File的方法
    public abstract void visitor(File file);
    // 处理Directory的方法
    public abstract void visitor(Directory directory);

}
