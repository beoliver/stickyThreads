/**
 * Created by ben on 16/07/15.
 */
public class Main {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runner());
        Thread t2 = new Thread(new Runner());
        Thread t3 = new Thread(new Runner());

        t1.start();
        t2.start();
        t3.start();

//        t1.interrupt();
//        t2.interrupt();
//        t3.interrupt();


        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {}

        // we can only call releaseAll after every thread is waiting on the lock
        Runner.releaseAll();

    }

}
