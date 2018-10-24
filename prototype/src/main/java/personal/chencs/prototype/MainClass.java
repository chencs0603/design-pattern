package personal.chencs.prototype;

import personal.chencs.prototype.framework.Manager;
import personal.chencs.prototype.framework.Product;
import personal.chencs.prototype.impl.MessageBox;
import personal.chencs.prototype.impl.UnderlinePen;

/**
 * @author: chencs
 * @date: 2018/10/24
 */
public class MainClass {

    public static void main(String[] args) {
        Manager manager = new Manager();

        UnderlinePen underlinePen = new UnderlinePen('~');
        MessageBox messageBox1 = new MessageBox('*');
        MessageBox messageBox2 = new MessageBox('/');
        // 注册实例
        manager.register("strong message", underlinePen);
        manager.register("warning message", messageBox1);
        manager.register("slash message", messageBox2);

        // 通过复制生成实例
        Product product1 = manager.create("strong message");
        product1.use("hello world");

        Product product2 = manager.create("warning message");
        product2.use("hello world");

        Product product3 = manager.create("slash message");
        product3.use("hello world");
    }
}
