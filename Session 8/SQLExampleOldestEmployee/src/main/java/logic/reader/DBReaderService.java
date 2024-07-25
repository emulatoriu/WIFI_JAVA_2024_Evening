package logic.reader;

import data.DBConnection;

import java.sql.*;
import java.util.List;

public class DBReaderService<T> {

    private final DBConnection dbConnection;
    private final ResultSetService<T> resultSetService;

    public DBReaderService(DBConnection dbConnection, ResultSetService<T> resultSetService) {
        this.dbConnection = dbConnection;
        this.resultSetService = resultSetService;
    }

    public List<T> readFromDB(String query) {
        try (Connection connection = DriverManager.getConnection(dbConnection.url(), dbConnection.user(), dbConnection.password());
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            return resultSetService.resultSetToList(resultSet);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
