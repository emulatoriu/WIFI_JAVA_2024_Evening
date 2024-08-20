import logic.ThreadOneRunner;
import logic.ThreadTwoRunner;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new ThreadOneRunner(); // extended
        ThreadTwoRunner t2 = new ThreadTwoRunner(); // implements

        Runnable t3 = new Runnable() { // Anonymous class
            @Override
            public void run() {

            }
        };

        t1.start();
        t2.run();

        try {
            t1.join(); // wait until thread one finishes
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Halloooooooooooooooooooooo");
    }
}
