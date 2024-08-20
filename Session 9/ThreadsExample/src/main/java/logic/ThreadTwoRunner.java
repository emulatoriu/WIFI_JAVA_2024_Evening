package logic;

public class ThreadTwoRunner implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<1000; i++) {
            System.out.printf("Thread two: %d", i);
            System.out.println();
        }
    }
}
