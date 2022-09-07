package state_of_java.static_example;

public class Runner {
    public static void main(String[] args) {


        Animal hamster = new Animal("Mike", "Sammie", "Very small");

        Animal lion = new Animal("Simba", "King", "Big");

        Animal.canBreath = false; // apocalypses happened

        System.out.println("Lion is alive? " + lion.canBreath);



    }
}
