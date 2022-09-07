public class OlgaTown {

    int population;
    double area;
    String language;

    public OlgaTown(int population, double area, String language){
        this.population = population;
        this.area = area;
        this.language = language;
    }

    public void grow(){
        System.out.println("Population is growing " + (population * 0.5));
    }


}
