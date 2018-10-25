package personal.chencs.factory.idcard;

import personal.chencs.factory.framework.Product;

/**
 * Product的实现类
 *
 * @author: chencs
 * @date: 2018/10/23
 */
public class IDCard extends Product {

    private String owner;

    public IDCard(String owner) {
        System.out.println("make " + owner + "'s id card");
        this.owner = owner;
    }

    public void use() {
        System.out.println("use " + this.owner + "'s id card");
    }

    public String getOwner() {
        return this.owner;
    }
}
