package personal.chencs.chain;

/**
 * 解决问题的具体实现类：只解决奇数的问题
 *
 * @author: chencs
 * @date: 2018/10/30
 */
public class OddSupport extends Support {
    public OddSupport(String name) {
        super(name);
    }

    public boolean resolve(Trouble trouble) {
        if (trouble.getNum()%2 == 0) {
            return false;
        } else {
            return true;
        }
    }
}
