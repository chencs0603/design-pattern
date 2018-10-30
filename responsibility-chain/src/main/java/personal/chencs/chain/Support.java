package personal.chencs.chain;

/**
 * 解决问题的类
 *
 * @author: chencs
 * @date: 2018/10/30
 */
public abstract class Support {

    private String name;
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    // 模板方法
    public final void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (null != this.next) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    public abstract boolean resolve(Trouble trouble);

    public void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + ".");
    }

    public void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved.");
    }

    @Override
    public String toString() {
        return "Support{" +
                "name='" + name + '\'' +
                '}';
    }
}
