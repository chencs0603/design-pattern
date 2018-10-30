package personal.chencs.chain;

/**
 * 解决问题的具体实现类：只解决小于limit的问题
 *
 * @author: chencs
 * @date: 2018/10/30
 */
public class LimitSupport extends Support {

    private int limit;

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    public boolean resolve(Trouble trouble) {
        if (trouble.getNum() >= this.limit) {
            return false;
        } else {
            return true;
        }
    }
}
