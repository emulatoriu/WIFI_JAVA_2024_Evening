package logic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {
    public List<String> readStudentsNamesFromFile(String uri) {
        Path path = Paths.get(uri);
        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("File nicht gefunden");
        }
        return List.of();
    }
}
