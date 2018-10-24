package personal.chencs.prototype.framework;

import java.util.HashMap;
import java.util.Map;

/**
 * 使用Product接口来复制实例
 * 不会出现具体的实现类，因此不会与实现耦合
 *
 * @author: chencs
 * @date: 2018/10/24
 */
public class Manager {

    // 充当容器，保存名称与实例之间的对应关系
    private Map<String, Product> showcase = new HashMap<String, Product>();

    public void register(String name, Product product) {
        showcase.put(name, product);
    }

    public Product create(String name) {
        Product product = showcase.get(name);

        return product.createClone();
    }
}
