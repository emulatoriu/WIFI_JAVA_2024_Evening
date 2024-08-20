import logic.ReadService;
import logic.WriteService;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Main {
    public static void main(String[] args) {
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        try {
            PipedInputStream pipedInputStream = new PipedInputStream(pipedOutputStream);
            Thread t1 = new WriteService(pipedOutputStream);
            Thread t2 = new ReadService(pipedInputStream);
            t1.start();
            t2.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
