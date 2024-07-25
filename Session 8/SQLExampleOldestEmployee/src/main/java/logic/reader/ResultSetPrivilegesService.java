package logic.reader;

import data.Employee;
import data.Privileges;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ResultSetPrivilegesService<T> implements ResultSetService {
    @Override
    public List<Privileges> resultSetToList(ResultSet resultSet) throws SQLException {
        List<Privileges> privileges = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id"); // todo: als Konstante im Interface
            String name = resultSet.getString("privilege_name");
            privileges.add(new Privileges(id, name));
        }
        return privileges;
    }
}
