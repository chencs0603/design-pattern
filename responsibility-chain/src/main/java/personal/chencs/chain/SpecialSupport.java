package personal.chencs.chain;

/**
 * 解决问题的具体实现类：只解决特定编号的问题
 *
 * @author: chencs
 * @date: 2018/10/30
 */
public class SpecialSupport extends Support {
    private int num;

    public SpecialSupport(String name, int num) {
        super(name);
        this.num = num;
    }

    public boolean resolve(Trouble trouble) {
        if (this.num != trouble.getNum()) {
            return false;
        } else {
            return true;
        }
    }
}
