/**
 * Created by ben on 16/07/15.
 */
public class Runner implements Runnable {

    private static Glue glue = new Glue();

    public static void releaseAll() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " about to call static Runner method releaseAll()");
        glue.unstickAll();
    }

    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " Runner begun run()");
        glue.stick();
        System.out.println(name + " Runner finished run()");
    }

}
