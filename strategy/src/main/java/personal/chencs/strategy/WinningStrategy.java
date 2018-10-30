package personal.chencs.strategy;

import java.util.Random;

/**
 * 具体策略接口实现
 *
 * @author: chencs
 * @date: 2018/10/29
 */
public class WinningStrategy implements Strategy {

    private Hand previousHand;
    private boolean won = false;

    public Hand nextHand() {
        // 如果上一局获胜，则出与上一局相同的手势，否则随机出手势
        if (!won) {
            previousHand = Hand.getHand(new Random().nextInt(3));
        }
        return previousHand;
    }

    public void study(boolean win) {
        this.won = win;
    }
}
