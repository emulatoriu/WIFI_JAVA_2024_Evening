import data.Cat;
import data.DbConnection;
import repository.CatsRepository;

public class Application {
    public static void main(String[] args) {
        DbConnection dbConnection = new DbConnection("jdbc:mysql://localhost/cats", "root", "");
        Cat cat = new Cat("Mietz", "Nix");
        CatsRepository catsRepository = new CatsRepository(dbConnection);
        catsRepository.saveCat(cat);
    }
}
