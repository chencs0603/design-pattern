package personal.chencs.factory.idcard;

import personal.chencs.factory.framework.Factory;
import personal.chencs.factory.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Factory的实现类
 *
 * @author: chencs
 * @date: 2018/10/23
 */
public class IDCardFactory extends Factory {

    private List<String> ownerList = new ArrayList<String>();

    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    protected void registerProduct(Product product) {
        ownerList.add(((IDCard)product).getOwner());
    }

    public List<String> getOwnerList() {
        return this.ownerList;
    }
}
