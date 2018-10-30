package personal.chencs.strategy;

import java.util.Random;

/**
 * 具体策略接口实现
 *
 * @author: chencs
 * @date: 2018/10/29
 */
public class ProbStrategy implements Strategy {
    private Hand previousHand = Hand.getHand(0);
    private Hand currentHand = Hand.getHand(0);

    // history[上一局出的手势][这一句出的手势]获胜的次数
    private int[][] history = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1},
    };

    public Hand nextHand() {
        int bet = new Random().nextInt(getSum(this.currentHand.getValue()));
        int handValue;
        if (bet < history[currentHand.getValue()][0]) {
            handValue = 0;
        } else if (bet < history[currentHand.getValue()][0] + history[currentHand.getValue()][1]) {
            handValue = 1;
        } else {
            handValue = 2;
        }
        return Hand.getHand(handValue);
    }

    private int getSum(int handValue) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += history[handValue][i];
        }
        return sum;
    }

    public void study(boolean win) {
        if (win) {
            history[previousHand.getValue()][currentHand.getValue()]++;
        } else {
            history[previousHand.getValue()][(currentHand.getValue() + 1) % 3]++;
            history[previousHand.getValue()][(currentHand.getValue() + 2) % 3]++;
        }
    }
}
