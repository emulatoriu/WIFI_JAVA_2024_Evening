package employeeEmail.data.logic;

import employeeEmail.data.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeService {
    public Map<Employee, String> getEmployeeEmailMap(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.
                        toMap(employee->employee, employee ->employee.email()));
    }
}
