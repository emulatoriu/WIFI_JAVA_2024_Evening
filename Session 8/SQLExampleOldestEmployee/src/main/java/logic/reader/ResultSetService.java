package logic.reader;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface ResultSetService<T> {
    List<T> resultSetToList(ResultSet resultSet) throws SQLException;
}
