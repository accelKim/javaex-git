package classExample2;

public class Person {
  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public Person setName(String name) {
    this.name = name;
    return this;
  }

  public int getAge() {
    return age;
  }

  public Person setAge(int age) {
    this.age = age;
    return this;
  }
  public void sayHello() {
    System.out.printf("안녕하세요 저의 이름은 %s 이고 %d입니다\n", name, age);
  }
}
