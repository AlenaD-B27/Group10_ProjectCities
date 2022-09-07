package state_of_java.static_example;

public class Animal {

    String name; // ---> different for each animal
    String breed; // ---> different for each animal
    String size; // ---> different for each animal
    static boolean canBreath; // ---> the same for each animal

    public Animal(String name, String breed, String size) {
        this.name = name;
        this.breed = breed;
        this.size = size;
    }
    static {
        canBreath = true;
    }
}
