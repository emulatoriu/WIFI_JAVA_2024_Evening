package logic;

public class ThreadOneRunner extends Thread{
    @Override
    public void run() {
        for(int i=0; i<1000; i++) {
            System.out.printf("Thread one: %d", i);
            System.out.println();
        }
    }
}
