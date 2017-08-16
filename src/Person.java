/**
 * Created by alisewiseman on 5/10/17.
 */
public class Person {
  private String name;
  private int age;
  private Person mother;
  private Person father;

  public Person(){
    this(null);
  }

  public Person(String name) {
    this(name, 0);
  }

  public Person(String name,int age) {
    this(name, age, null);
  }

  public Person(String name, int age, Person mother) {
    this(name, age, mother, null);
  }

  public Person(String name, int age, Person mother, Person father) {
    this.name = name;
    this.age = age;
    this.mother = mother;
    this.father = father;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

}
