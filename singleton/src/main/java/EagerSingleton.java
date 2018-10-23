/**
 * 单例类
 * 饿汉式实现
 *
 * @author: chencs
 * @date: 2018/10/23
 */
public class EagerSingleton {

    // 在类加载时就完成初始化，不用考虑线程安全问题
    // 类加载速度慢，但获取对象速度快
    private static EagerSingleton singleton = new EagerSingleton();

    private EagerSingleton() {
        System.out.println("create singleton......");
    }

    public static EagerSingleton getInstance() {
        return singleton;
    }

}
