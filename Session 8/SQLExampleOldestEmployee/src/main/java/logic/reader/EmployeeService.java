package logic.reader;

import data.Employee;

import java.util.List;
import java.util.Optional;

public class EmployeeService {
    private final List<Employee> employees;

    public EmployeeService(List<Employee> employees) {
        this.employees = employees;
    }

    public Optional<Employee> getEmployeeWithLongestLastName() {
        return employees.stream()
                .reduce((e1, e2) -> e1.lastname().length() > e2.lastname().length() ? e1 : e2);
    }
}
