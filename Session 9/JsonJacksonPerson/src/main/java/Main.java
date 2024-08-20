import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import data.Person;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Person person = new Person("Bugs", 70);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String jsonBugs = objectMapper.writeValueAsString(person);
            System.out.println(jsonBugs);
            objectMapper.writeValue(new File("target/person.json"), person);
            Person readFromJsonString = objectMapper.readValue(jsonBugs, Person.class); // generate Person from json String
            System.out.println(readFromJsonString);
            Person readPerson = objectMapper.readValue(new File("target/person.json"), Person.class);
            System.out.println(readPerson);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
