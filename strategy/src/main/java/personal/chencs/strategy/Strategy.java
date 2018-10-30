package personal.chencs.strategy;

/**
 * 策略接口
 *
 * @author: chencs
 * @date: 2018/10/29
 */
public interface Strategy {

    /**
     * 获取下一局要出的手势
     * @return
     */
    public Hand nextHand();

    /**
     * 上一局手势是否获胜
     * @param win
     */
    public void study(boolean win);

}
