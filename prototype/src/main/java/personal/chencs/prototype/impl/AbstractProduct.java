package personal.chencs.prototype.impl;

import personal.chencs.prototype.framework.Product;

/**
 * 抽象类：复用复制方法的代码
 *
 * @author: chencs
 * @date: 2018/10/24
 */
public abstract class AbstractProduct implements Product {

    public Product createClone() {
        // clone方法是定义在Object类，因此所有的Java类都继承了clone方法
        // 直接或间接实现了Cloneable接口的类调用clone方法会实例的复制工作，否则会抛出CloneNotSupportedException
        // clone方法进行的是浅拷贝
        Product product = null;
        try {
            product = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return product;
    }

    protected String makeLine(char ch, int count) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buffer.append(ch);
        }

        return buffer.toString();
    }
}
