/**
 * 单例类
 * 懒汉式实现
 *
 * @author: chencs
 * @date: 2018/10/23
 */
public class LazySingleton {

    // 类加载时不进行初始化，需要考虑线程安全问题
    // 类加载速度快，但获取对象速度慢
    private static LazySingleton singleton = null;

    private LazySingleton() {
        System.out.println("create singleton......");
    }

    // 同步方法可以保证线程安全，但是同步效率较低
    public synchronized static LazySingleton getInstance() {
        if (null == singleton) {
            singleton = new LazySingleton();
        }

        return singleton;
    }

    public static LazySingleton getInstance1() {
        // 同步代码块可以保证线程安全，但是同步效率也较低
        synchronized (LazySingleton.class) {
            if (null == singleton) {
                singleton = new LazySingleton();
            }
        }

        return singleton;
    }

    public static LazySingleton getInstance2() {
        if (null == singleton) {
            // sleep是为了增加线程不安全问题发生的概率
            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
            // 缩小同步代码块的范围，即锁住共享变量的操作，但不能保证线程安全
            synchronized (LazySingleton.class) {
                singleton = new LazySingleton();
            }
        }

        return singleton;
    }

    public static LazySingleton getInstance3() {
        // 使用双检锁可以保证线程安全
        if (null == singleton) {
            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
            // 缩小同步代码块的范围，即锁住共享变量的操作，但不能保证线程安全
            synchronized (LazySingleton.class) {
                if (null == singleton) {
                    singleton = new LazySingleton();
                }
            }
        }

        return singleton;
    }

}
