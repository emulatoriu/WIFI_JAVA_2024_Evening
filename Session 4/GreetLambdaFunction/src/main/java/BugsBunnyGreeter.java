public class BugsBunnyGreeter implements Greets{
    @Override
    public void greet(String name) {
        System.out.println("Whats " + name + " up doc?");
    }
}
