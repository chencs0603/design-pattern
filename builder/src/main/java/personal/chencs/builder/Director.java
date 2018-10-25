package personal.chencs.builder;

/**
 * 定义构建实例的通用流程或顺序
 *
 * @author: chencs
 * @date: 2018/10/25
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    // 类似于模板方法，但是具体实现在builder的实现类中
    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("从早上到下午");
        builder.makeItems(new String[] {
                "早上好",
                "下午好"
        });
        builder.makeString("晚上");
        builder.makeItems(new String[]{
                "晚上好",
                "晚安",
                "再见"
        });
        builder.close();
    }
}
