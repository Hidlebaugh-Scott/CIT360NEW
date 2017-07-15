package threads;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorsDemo {

    public static void main(String[] args) {


        Executor executor1 = Executors.newCachedThreadPool();

        // happy path
        for (int i = 0; i < 3; i++) {

            RunnablesDemo runnable1 = new RunnablesDemo();

            executor1.execute(runnable1);

        }

        // nasty path - get a null pointer exception
        try {
            executor1.execute(null);
        } catch (Exception e){
            e.printStackTrace();
        }


        // set an upper limit, newupperlmit? 3 when I can only run 2

        Executor executor2 = Executors.newFixedThreadPool(1);
        // nasty path
        for (int i = 0; i < 3; i++) {
            RunnablesDemo runnable2 = new RunnablesDemo();
            RunnablesDemo runnable3 = new RunnablesDemo();
            RunnablesDemo runnable4 = new RunnablesDemo();

            // Exception in thread "main" java.lang.IllegalArgumentException
            Thread.currentThread().setPriority(9999);

            executor2.execute(runnable2);
            executor2.execute(runnable3);
            executor2.execute(runnable4);

        }

    }

}
