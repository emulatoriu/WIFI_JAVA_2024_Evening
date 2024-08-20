package data;

public class Customer {
    private double balance;
    private String firstName;
    private String lastName;

    public Customer(double balance, String firstName, String lastName) {
        this.balance = balance;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
