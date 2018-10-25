package personal.chencs.builder;

/**
 * 接口：定义构建实例的必要方法
 *
 * @author: chencs
 * @date: 2018/10/25
 */
public interface Builder {

    public void makeTitle(String title);

    public void makeString(String string);

    public void makeItems(String[] items);

    public void close();

    public String getResult();
}
