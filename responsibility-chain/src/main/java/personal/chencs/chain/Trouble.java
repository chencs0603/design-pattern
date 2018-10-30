package personal.chencs.chain;

/**
 * 需要处理的问题
 *
 * @author: chencs
 * @date: 2018/10/30
 */
public class Trouble {

    private int num;

    public Trouble(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "Trouble{" +
                "num=" + num +
                '}';
    }
}
