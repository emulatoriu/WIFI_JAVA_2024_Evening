import data.Customer;
import logic.BankService;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(100, "A", "B");
        BankService bankService = new BankService();
        Thread t1 = new Thread(){
            @Override
            public void run() {

                bankService.withdrawMoney(customer, 200);
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                bankService.depositMoney( customer, 300);
            }
        };

        t1.start();
        t2.start();


    }
}
