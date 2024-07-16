import data.Animal;
import data.Dog;
import repository.AnimalRepository;

public class Application {
    public static void main(String[] args) {
        AnimalRepository animalRepository = AnimalRepository.getAnimalRepository();
        Animal animal1 = new Animal("yellow", 10_000, "Yellowhale");
        animal1.id = 1;
        Animal animal2 = new Animal("blue", 1, "gdfdsfg");
        animal2.id = 2;
        System.out.println(animal1.id);
        System.out.println(animal2.id);
        System.out.println(Animal.id);

        Animal dog1 = new Dog("grey", 20, "Doggy");
        System.out.println(dog1.getColor());
        changeColor(dog1);
        System.out.println(dog1.getColor());

        int i = 5;
        System.out.println(i);
        int a = increase(i);
        System.out.println(i);
        System.out.println(a);
        //System.out.println(dog1.makeSound()); --> geht nicht

        String name = "Bla";
        String name2 = name+name;
        System.out.println(name2=="BlaBla");
        System.out.println(name2.equals("BlaBla"));
        System.out.println(name2.equalsIgnoreCase("bLaBla"));

        //ENdless loop
//        int j=0;
//        for(; j<10; j=j++) {
//            System.out.println("Hallo");
//        }

        char B = 'A' + 1;
        System.out.println(B);

    }
    private static int increase(int number) {
        ++number;
        return number;
    }

    private static void changeColor(Animal animal) {
        animal.setColor("red");
    }
}
