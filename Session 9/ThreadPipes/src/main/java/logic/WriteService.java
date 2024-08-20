package logic;

import java.io.IOException;
import java.io.PipedOutputStream;

public class WriteService extends Thread {
    private final PipedOutputStream pipedOutputStream;

    public WriteService(PipedOutputStream pipedOutputStream) {
        this.pipedOutputStream = pipedOutputStream;
    }

    @Override
    public void run() {
        try {
            pipedOutputStream.write("Hallo, ich bin \n der schreibende Thread".getBytes());
            pipedOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
