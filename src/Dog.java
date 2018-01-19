public class Dog extends Animal {
  public String dogBreed;

  public Dog () {

  }

  public void setDogBreed (Dogs dogBreed) {
    this.dogBreed = dogBreed.name();
  }

    public void speak(String speak) {
    System.out.println("bark");
  }
}
