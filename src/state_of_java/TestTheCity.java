package state_of_java;

public class TestTheCity {

    public static void main(String[] args) {

        AlenaLand city1 = new AlenaLand();
        System.out.println(city1);


        city1.setInfo(100_000, 200_000.99, "English");
        System.out.println(city1);


        city1.area = 300_000;
        System.out.println(city1.area);



        AlenaLand city2 = new AlenaLand();
        System.out.println(city2.area);
        city2.area = 1;

        System.out.println(city1.area);











    }














}
