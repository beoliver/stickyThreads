/**
 * Created by ben on 16/07/15.
 */
public class Glue {

    public synchronized void stick() {
        String name = Thread.currentThread().getName();
        try {
            System.out.println(name + " about to call wait() method of Glue instance");
            wait();
            System.out.println(name + " after wait() method of Glue instance");
        } catch (InterruptedException e) {
            System.out.println(name + " interrupt() caught in Glue instance method stick()");
        }
    }

    public synchronized void unstickAll() {
        String name = Thread.currentThread().getName();
        notifyAll();
        System.out.println(name + " calling Glue instance method unstickAll()");
    }

}
