import java.time.LocalDateTime;

public class Application {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        String greets = now.getHour() < 18 ? "Guten Tag" : "Gute Nacht";
        System.out.println(greets);
    }
}
