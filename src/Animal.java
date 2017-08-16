/**
 * Created by alisewiseman on 5/22/17.
 */
public class Animal {
  public void eat() {
    System.out.println("I eat food.");
  }

  protected String name;

  public void printTypeOfAnimal() {
    if (this instanceof Dog) {
      System.out.println("This is a dog");
    }
    else if (this instanceof Panda) {
      System.out.println("This is a panda");
    }
    else if (this instanceof Horse) {
      ((Horse)this).typeOfAnimal();
      //casting used often in equals method
    }
    else if (this instanceof Tiger) {
      System.out.println("This is Tony");
    }
    else if (this instanceof Lion) {
      System.out.println("This is Simba");
    }
    else {
      System.out.println("This is just an animal");
    }
  }
}
