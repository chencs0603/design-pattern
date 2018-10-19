package personal.chencs.composite;

/**
 * 抽象类：代码复用
 * Template Method模式实现toString的代码复用
 * getName()和getSize()方法在子类实现
 *
 * @author: chencs
 * @date: 2018/10/19
 */
public abstract class AbstractEntry implements Entry {

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }

}
