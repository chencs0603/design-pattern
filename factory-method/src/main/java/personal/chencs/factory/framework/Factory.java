package personal.chencs.factory.framework;

/**
 * 工厂抽象类
 *
 * @author: chencs
 * @date: 2018/10/23
 */
public abstract class Factory {

    // 利用template模式定义生成Product实例的处理流程
    public final Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);

        return product;
    }

    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);

}
