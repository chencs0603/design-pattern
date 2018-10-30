package personal.chencs.strategy;

/**
 * 手势类
 * 单例模式：只能创建3个实例
 *
 * @author: chencs
 * @date: 2018/10/29
 */
public class Hand {

    public static final int SHITOU = 0;
    public static final int JIANDAO = 1;
    public static final int BU = 2;

    public static Hand[] hands = new Hand[] {
            new Hand(SHITOU),
            new Hand(JIANDAO),
            new Hand(BU)
    };

    private static String[] names = new String[] {
            "石头",
            "剪刀",
            "布"
    };

    private int value;

    private Hand(int value) {
        this.value = value;
    }

    public static Hand getHand(int value) {
        return hands[value];
    }

    public int getValue() {
        return value;
    }

    public boolean isStrongThan(Hand hand) {
        return fight(hand) == 1;
    }

    public boolean isWeakThan(Hand hand) {
        return fight(hand) == -1;
    }

    private int fight(Hand hand) {
        if (this.value == hand.value) {
            return 0;
        } else if((this.value + 1) % 3 == hand.value) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return names[this.value];
    }
}
