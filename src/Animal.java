public class Animal {
  private String animalType;
  private String speak;
  private  int animalWeight;
  

  public void speak () {
    System.out.println("hello");
  }

  public void speak (String speak) {
    System.out.println(speak);
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public void setAnimalWeight(int weight) {
    this.animalWeight = weight;
  }

  public String getAnimalType() {
    return this.animalType;
  }

  public int getAnimalWeight() {
    return this.animalWeight;
  }


}
