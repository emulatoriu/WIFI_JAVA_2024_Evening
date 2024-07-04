import data.Employee;
import data.EmployeeType;
import data.Weekdays;

public class Application {
    public static void main(String[] args) {
        Employee employee = new Employee("1", "Emil", EmployeeType.SENIOR);
        int salary = employee.getEmployeeType().getSalary();
        System.out.println(salary);

        Weekdays[] allWeekdays = Weekdays.values();
        System.out.println(Weekdays.MONDAY);
    }
}
