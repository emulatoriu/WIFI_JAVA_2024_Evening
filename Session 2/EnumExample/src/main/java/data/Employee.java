package data;

public class Employee {
    private final String id;
    private final String name;
    private final EmployeeType employeeType;

    public Employee(String id, String name, EmployeeType employeeType) {
        this.id = id;
        this.name = name;
        this.employeeType = employeeType;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }
}
