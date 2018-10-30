package personal.chencs.strategy;

/**
 *
 *
 * @author: chencs
 * @date: 2018/10/30
 */
public class MainClass {

    public static void main(String[] args) {
       Player player1 = new Player("xiaoming", new WinningStrategy());
       Player player2 = new Player("xiaohong", new ProbStrategy());

       for (int i = 0; i < 10000; i++) {
           Hand hand1 = player1.nextHand();
           Hand hand2 = player2.nextHand();
           if (hand1.isStrongThan(hand2)) {
               player1.win();
               player2.lose();
           } else if(hand1.isWeakThan(hand2)) {
               player1.lose();
               player2.win();
           } else {
               player1.even();
               player2.even();
           }
       }
       System.out.println(player1);
       System.out.println(player2);
    }
}
