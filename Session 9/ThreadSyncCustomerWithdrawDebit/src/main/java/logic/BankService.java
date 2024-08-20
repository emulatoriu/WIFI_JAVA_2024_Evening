package logic;

import data.Customer;

public class BankService {
    synchronized public void withdrawMoney(Customer customer, double amount) {
        if (customer.getBalance() < amount) {
            try {
                System.out.println("Waiting for more money....");
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.printf("Customer %s has a balance of %f before withdraw", customer.getLastName(), customer.getBalance());
        System.out.println();
        //withdraw money
        customer.setBalance(customer.getBalance() - amount);
        System.out.printf("Customer %s has a balance of %f after withdraw", customer.getLastName(), customer.getBalance());
        System.out.println();

    }

    synchronized public void depositMoney(Customer customer, double amount) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        customer.setBalance(customer.getBalance()+amount);
        System.out.println("Added more money, amount: " + amount);
        notify();
    }
}
