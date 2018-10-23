/**
 * @author: chencs
 * @date: 2018/10/23
 */
public class MainClass {

    public static void main(String[] args) {
        EagerSingleton singleton1 = EagerSingleton.getInstance();
        EagerSingleton singleton2 = EagerSingleton.getInstance();
        if (singleton1 == singleton2) {
            System.out.println("Singleton Works!!!");
        }
    }
}
