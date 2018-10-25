package personal.chencs.builder;

/**
 *
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
