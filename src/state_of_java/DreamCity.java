package state_of_java;

public class DreamCity {
    int population;
    static double area = 765_967;
    String language;
    public DreamCity(int population, String language){
        this.population = population;
        this.language = language;
    }
    public void grow(){
        System.out.println("Population is growing on 5% " + ((population * 0.5) - population));
    }
    public String toString(){
        return "Population of Dream city: " + population + "\narea: " + area + "\nlanguage" + language;
    }
}
