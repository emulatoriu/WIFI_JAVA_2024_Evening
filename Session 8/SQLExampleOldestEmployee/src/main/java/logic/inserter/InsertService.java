package logic.inserter;

import data.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertService {
    private final DBConnection dbConnection;

    public InsertService(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void insertPrivileges(String privileges) {
        String insertQuery = "insert into privileges(privilege_name) values(?)";
        try(Connection connection = DriverManager.getConnection(dbConnection.url(), dbConnection.user(), dbConnection.password())) {
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, privileges);
            preparedStatement.execute();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
