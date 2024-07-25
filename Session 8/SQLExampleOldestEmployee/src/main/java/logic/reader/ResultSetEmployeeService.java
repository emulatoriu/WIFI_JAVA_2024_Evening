package logic.reader;

import data.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ResultSetEmployeeService<T> implements ResultSetService{
    @Override
    public List<Employee> resultSetToList(ResultSet resultSet) throws SQLException {
        List<Employee> employees = new ArrayList<>();
        while (resultSet.next()) {
            String firstname = resultSet.getString("first_name");
            String lastname = resultSet.getString("last_name");
            String email = resultSet.getString("email_address");

            employees.add(new Employee(firstname, lastname, email));
        }
        return employees;
    }
}
