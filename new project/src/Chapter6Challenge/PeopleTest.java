package Chapter6Challenge;

public class PeopleTest {
  public static void main(String[] args) {
    Person person = new Person("민국" , 21);
    person.show();
    Student student = new Student("민국", 24, 18  );
    student.show();
    ForeignStudent foreignStudent = new ForeignStudent("Amy", 22, 18, "USA");
    foreignStudent.show();
  }
}

class Person{
  String name = "";
  int age = 0;


  public Person(String name, int age){
    this.age = age;
    this.name = name;

  }

  Person() {}

  void show(){
    System.out.printf("%d 살 %s 입니다\n", age, name);
  }
}

class Student extends Person{
  int collageGrade = 0;

  public Student(String name, int age, int collageGrade) {
    super(name, age);
    this.collageGrade = collageGrade;
  }

  Student() {}

  void show(){
    System.out.println(collageGrade + "학번 " +age + " 살 " + name + "입니다");
  }
}

class ForeignStudent extends Student{
  String contury = "";

  public ForeignStudent(String name, int age, int collageGrade, String contury) {
    super(name, age, collageGrade);
    this.contury = contury;
  }

  void show(){
    System.out.println( contury + "국적의 " + collageGrade + " 학번 " + age + "살" + name + "입니다");
  }

}


