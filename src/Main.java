import java.util.ArrayList;
import java.util.List;

/**
 * Created by alisewiseman on 5/8/17.
 */
public class Main {
  public static void main(String[] args){
    //MyFileReader reader = new MyFileReader("sample.txt");
    //reader.readLines();
    //reader = new MyFileReader("sample.txt");
    //reader.reverseReadLines();
    //totalCharacters();

    //XMLWriter xmlWriter = new XMLWriter("XML1.xml");
    //xmlWriter.compositionWriteLine("hello");
    //xmlWriter.compositionWriteLine("world");
    //xmlWriter.inheritanceWriteLine("hello ");
    //xmlWriter.inheritanceWriteLine("world");
    //xmlWriter.staticWriteLine("hello!");
    //
    //LineOrientedWriter lineOrientedWriter = new LineOrientedWriter("line1.txt");
    //lineOrientedWriter.compositionWriteLine("hello");
    //lineOrientedWriter.inheritanceWriteLine("hello ");
    //lineOrientedWriter.staticWriteLine("hello!");

    //int a = 1, c = 1;
    //Person p = new Person("p", 1);
    //System.out.println("before, value: " + a + " reference: " + p.getAge() + " final: " + c);
    //determineChange(a, p, c);
    //System.out.println("after, value: " + a + " reference: " + p.getAge() + " final: " + c);

    Animal animal = new Animal();
    animal.printTypeOfAnimal();
    animal.eat();
    animal = new Dog();
    animal.printTypeOfAnimal();
    animal.eat();
    Panda panda = new Panda();
    panda.printTypeOfAnimal();
    panda.eat();
    Horse horse = new Horse();
    horse.printTypeOfAnimal();
    horse.eat();

    Cat cat = new Tiger();
    cat.printTypeOfAnimal();
    cat.speak();
    cat = new Lion();
    cat.printTypeOfAnimal();
    cat.speak();
  }

  public static void totalCharacters() {
    String s = "12345678901234567890123456789012345678901234567890";
    List<String> list = new ArrayList<>();
    long items = 0;
    try {
      while (true) {
        items++;
        list.add(s);
      }
    }catch (OutOfMemoryError e) {
      System.out.println("Size of list: " + items); //printed 354836041
    }
  }

  public static void uncheckedException() {
    try {
      int a = 2;
      int b = 0;
      int c = a/b;
    }
    catch (ArithmeticException e) {

    }
  }

  public static void determineChange(int value, Person reference, final int keywordFinal){
    value++;
    reference.setAge(reference.getAge()+1);
    //keywordFinal cannot be changed
    System.out.println("during, value: " + value + " reference: " + reference.getAge() + " final: " + keywordFinal);
  }
}
