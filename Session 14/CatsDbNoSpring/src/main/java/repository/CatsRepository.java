package repository;

import data.Cat;
import data.DbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.UUID;

public class CatsRepository {
    private final DbConnection dbConnection;

    public CatsRepository(DbConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void saveCat(Cat cat) {
        String saveQuery = "INSERT INTO Cats(id, name, breed, user_id) VALUES(?, ?)";
        try(Connection connection =
                    DriverManager.getConnection(dbConnection.connection(),
                            dbConnection.user(), dbConnection.password());
            PreparedStatement statement = connection.prepareStatement(saveQuery)) {
            UUID uuid = UUID.randomUUID();
            statement.setObject(1, uuid);
            statement.setString(2, cat.name());
            statement.setString(3, cat.breed());
            statement.setInt(4, 0);
            statement.execute();
        } catch(Exception e) {

        }
    }
}
