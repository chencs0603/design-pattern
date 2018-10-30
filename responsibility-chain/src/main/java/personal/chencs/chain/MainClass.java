package personal.chencs.chain;

/**
 * @author: chencs
 * @date: 2018/10/30
 */
public class MainClass {

    public static void main(String[] args) {
        Support alice = new NoSupport("Alice");
        Support bob = new LimitSupport("Bob", 10);
        Support charlie = new SpecialSupport("Charlie", 29);
        Support diana = new LimitSupport("Diana", 40);
        Support elmo = new OddSupport("Elmo");
        Support fred = new LimitSupport("Fred", 80);
        // 责任链
        alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);

        // 制造各种问题并交给责任链解决
        for (int i = 0; i < 100; i++) {
            alice.support(new Trouble(i));
        }
    }

}
