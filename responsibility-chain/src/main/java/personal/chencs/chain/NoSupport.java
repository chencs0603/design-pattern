package personal.chencs.chain;

/**
 * 解决问题的具体实现类：永远不解决问题
 *
 * @author: chencs
 * @date: 2018/10/30
 */
public class NoSupport extends Support {

    public NoSupport(String name) {
        super(name);
    }

    public boolean resolve(Trouble trouble) {
        return false;
    }
}
