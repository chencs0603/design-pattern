package personal.chencs.factory;

import personal.chencs.factory.framework.Factory;
import personal.chencs.factory.framework.Product;
import personal.chencs.factory.idcard.IDCardFactory;

/**
 * @author: chencs
 * @date: 2018/10/23
 */
public class MainClass {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product xiaoming = factory.create("xiaoming");
        Product xiaohong = factory.create("xiaohong");
        Product xiaofang = factory.create("xiaofang");

        xiaoming.use();
        xiaohong.use();
        xiaofang.use();
    }
}
