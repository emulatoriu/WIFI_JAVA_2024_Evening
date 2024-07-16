import logic.FileReader;
import logic.RandomSelector;

import java.util.List;
import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Random random = new Random();
        RandomSelector randomSelector = new RandomSelector(random);
        FileReader fileReader = new FileReader();
        List<String> names = fileReader.readStudentsNamesFromFile("D:\\test.txt");
        String selected = randomSelector.getRandomName(names);
        System.out.println(selected);
    }
}
