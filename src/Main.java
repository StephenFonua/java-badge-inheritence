public class Main {

  public static void main(String[] args) {
    Animal dog1 = new Dog();
    dog1.setAnimalType("Border Collie");
    dog1.speak();

    Dog dog = new Dog();
    dog.setDogBreed(Dogs.PITBULL);
    dog.speak("blah");

    Monkey monkey = new Monkey();
    monkey.setAnimalWeight(53);
    monkey.speak("blahMonkey");
  }
}
