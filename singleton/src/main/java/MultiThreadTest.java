/**
 * @author: chencs
 * @date: 2018/10/23
 */
public class MultiThreadTest extends Thread {
    @Override
    public void run() {
        System.out.println(LazySingleton.getInstance3().hashCode());
    }

    public static void main(String[] arg) {
        int threadNum = 1000;
        MultiThreadTest[] multiThreadTests = new MultiThreadTest[threadNum];
        for (int i = 0; i < threadNum; i++) {
            multiThreadTests[i] = new MultiThreadTest();
        }

        for (int i = 0; i < threadNum; i++) {
            multiThreadTests[i].start();
        }
    }
}
