/**
 * Created by ben on 16/07/15.
 */
public class Glue {

    public synchronized void stick() {
        String name = Thread.currentThread().getName();
        try {
            System.out.println(name + " about to call wait()");
            wait();
            System.out.println(name + " after wait()");
        } catch (InterruptedException e) {
            System.out.println(name + " interrupt() called!");
        }
    }

    public synchronized void unstickAll() {
        String name = Thread.currentThread().getName();
        notifyAll();
        System.out.println(name + " calling unstickAll()");
    }

}
