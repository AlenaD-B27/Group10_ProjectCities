package state_of_java;

public class AlenaLand {
 static int population;
 static double area;
 static String language;

 public void setInfo(int population, double area, String language){
    this.population = population;
    this.area = area;
    this.language = language;
 }

 public void grow(){
  System.out.println("Population is growing");
  population *= 1.05;
 }

 @Override
 public String toString() {
  return "AlenaLand: " + "population = " + population + ", area = " + area + ", language is " + language + ".";
 }
}
