package state_of_java;

public class VitaliLand {

    int population;
    double area;
    String language;

  public VitaliLand(int population, double area, String language){
    this.population = population;
    this.area = area;
    this.language = language;
  }

    public void grow(int population) {
        System.out.println("Population is growing" + (population * 0.5));
  }

    @Override
    public String toString() {
        return "VitaliLand{" +
                "population=" + population +
                ", area=" + area +
                ", language='" + language + '\'' +
                '}';
    }
}
