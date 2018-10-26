package personal.chencs.factory;

/**
 * 抽象工厂
 * 生成抽象零件
 *
 * @author: chencs
 * @date: 2018/10/25
 */
public abstract class Factory {

    // 利用反射通过类名获取实例
    public static Factory getFactory(String className) {
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }

    // 生成抽象零件
    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);
}
