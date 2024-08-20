import io.ListPrint;
import logic.ListService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> text = new ArrayList<>();
        text.addAll(List.of("A", "B", "C", "D"));
        ListService listService = new ListService();
        ListPrint listPrint = new ListPrint();

        Thread t1 = new Thread() {
            @Override
            public void run() {
              synchronized (listService) {
                  listService.addText(text, "Bla");
                  try {
                      Thread.sleep(4000);
                  } catch (InterruptedException e) {
                      throw new RuntimeException(e);
                  }
                  synchronized (listPrint) {
                      listPrint.printList(text);
                  }
              }

            }
        };

        Thread t2 = new Thread() {
          @Override
          public void run() {
              synchronized (listPrint) {
                  listPrint.printList(text);
                  try {
                      Thread.sleep(4000);
                  } catch (InterruptedException e) {
                      throw new RuntimeException(e);
                  }
                  synchronized (listService) {
                      listService.addText(text, "bla2");
                  }
              }
          }
        };

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("READY");

    }
}
