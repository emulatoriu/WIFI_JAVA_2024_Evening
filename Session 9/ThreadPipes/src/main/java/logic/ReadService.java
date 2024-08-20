package logic;

import java.io.IOException;
import java.io.PipedInputStream;

public class ReadService extends Thread {
    private final PipedInputStream pipedInputStream;

    public ReadService(PipedInputStream pipedInputStream) {
        this.pipedInputStream = pipedInputStream;
    }

    @Override
    public void run() {
        try {
            int data = pipedInputStream.read();
            System.out.println("Here comes the Reader!");
            while(data != -1) {
                System.out.print((char)data);
                data = pipedInputStream.read();
            }
            System.out.println();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
