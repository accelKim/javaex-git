package Chapter7;

import java.util.Arrays;
import java.util.Collections;

public class PersonCompareTest {
  public static void main(String[] args) {
    Person[] persons = {
        new Person("홍길동",32, 170, 75),
        new Person("박지성",40,175,68),
        new Person("손흥민", 20,180,70)
    };
    System.out.println("나이 순서 대로");
    Arrays.sort(persons, Collections.reverseOrder());
    for (Person person:persons) {
      System.out.println(person);
    }
  }
}

class Person implements Comparable<Person>{
  String name;
  int age;
  int height;
  int weight;

  public Person(String name,int age, int height, int weight) {
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  @Override
  public int compareTo(Person p) {
    if (p instanceof Person){
      Person person = (Person) p;
      return this.age - p.age;
    }
    return 0;
  }

  @Override
  public String toString() {
    return "Person [이름 = " + name + ", 나이 = " + age + "]" ;
  }
}
