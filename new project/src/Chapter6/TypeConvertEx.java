package Chapter6;

public class TypeConvertEx {
  public static void main(String[] args) {
//    Person p = new Person();
//    Student s = new Student();
//
//    String name = s.name;
//    int number = s.number;
//    s.work();
//    s.whoAmI();
//
//    name = p.name;
//    p.whoAmI();
    Person p;
    Student s = new Student();
    Worker w = new Worker();
    p = s;
    String name = p.name;
    p.whoAmI();

    p = w;
    p.whoAmI();
    String s1;

    Object o = new Person();
    o = s;
    o = p;
    Person p1 = new Worker();
    Person p2 = new Student();
  }
}
