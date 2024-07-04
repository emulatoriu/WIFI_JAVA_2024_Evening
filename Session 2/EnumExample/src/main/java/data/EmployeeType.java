package data;

public enum EmployeeType {
    JUNIOR(2800),
    INTERMEDIATE(3500),
    SENIOR(6000);

    private final int salary;

    EmployeeType(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}
