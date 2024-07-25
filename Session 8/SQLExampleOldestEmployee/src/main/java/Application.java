import data.DBConnection;
import data.Employee;
import data.Privileges;
import logic.QueryConstants;
import logic.reader.*;

import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        //todo: read dbconnection from file
        DBConnection dbConnection = new DBConnection("jdbc:mysql://localhost/northwind", "root", "");
        ResultSetService<Employee> resultSetService = new ResultSetEmployeeService<>();
        DBReaderService dbReaderService = new DBReaderService(dbConnection, resultSetService);
        List<Employee> employees = dbReaderService.readFromDB(QueryConstants.employeeSelectQuery);

        ResultSetService<Privileges> resultSetService2 = new ResultSetPrivilegesService<>();
        //DBReaderService dbReaderService2 = new DBReaderService(dbConnection, resultSetService2);
        dbReaderService = new DBReaderService(dbConnection, resultSetService2);
        List<Privileges> privileges = dbReaderService.readFromDB(QueryConstants.privilegesSelectQuery);
        System.out.println(privileges);

        EmployeeService employeeService = new EmployeeService(employees);
        Optional<Employee> employee = employeeService.getEmployeeWithLongestLastName();
        System.out.println(employee);
//        InsertService insertService = new InsertService(dbConnection);
//        insertService.insertPrivileges("bla1");
//        insertService.insertPrivileges("bla2");

    }
}
