package personal.chencs.prototype.framework;

/**
 * 接口
 * 定义了复制和使用的功能，具体实现交给实现类
 *
 * @author: chencs
 * @date: 2018/10/24
 */
public interface Product extends Cloneable {

    public void use(String string);

    public Product createClone();
}
