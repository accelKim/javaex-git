package Chapter5;

public class EnumEx {
  public static void main(String[] args) {
    People people = new People();
    people.age = 20;
    people.gender = Gender.MALE;
    people.direction = Direction.EAST;


    People anotherPeople = new People();
    anotherPeople.age = 30;
    anotherPeople.gender = Gender.FEMALE;
    anotherPeople.direction = Direction.WEST;


    if (people.gender == Gender.MALE) System.out.println("남성입니다");
    if (people.direction == Direction.EAST) System.out.println("동쪽입니다");


    if(anotherPeople.gender == Gender.FEMALE) System.out.println("여성입니다");
    if(anotherPeople.direction == Direction.WEST) System.out.println("서쪽입니다");

    System.out.println(people.gender);
    System.out.println(people.direction);

  }
}

class  People {
  int age;
 Gender gender;
  Direction direction;
  static final int MALE = 0;
  static final int FEMALE = 1;
}
