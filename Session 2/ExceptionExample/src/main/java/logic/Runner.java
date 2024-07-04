package logic;

public class Runner {
    private final InputService inputService;
    public Runner(InputService inputService) {
        this.inputService = inputService;
    }
    public void run() {
        int age;
        while(true) {
            try {
                String input = inputService.getUserInput();
                age = Integer.parseInt(input);
                break;
            } catch (Exception e) {
                System.out.println("Please only type in numbers");
            }
        }
        System.out.println(age);
    }
}
