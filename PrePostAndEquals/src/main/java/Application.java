public class Application {
    public static void main(String[] args) {
        int number = 5;
        int secondNumber = 3;
        output((number++ * --secondNumber));

        String firstGreet = "Hallo";
        String anotherGreet = "Hallo";
        System.out.println(firstGreet == anotherGreet);
        String secondGreet = "Ha";
        String thirdGreet = "llo";
        String composition = secondGreet + thirdGreet;
        System.out.println(composition);
        System.out.println(firstGreet==composition);
        System.out.println(firstGreet.equals(composition));

    }
    private static void output(int number) {
        System.out.println(number);
    }
}

