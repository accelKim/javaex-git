package Chapter5;

public class ArrayStringEx {
  public static void main(String[] args) {
    String[] names = new String[3];
    for (String name: names) {
      System.out.println(name);
    }
    names[0] = "kim"; //객체이지만 리터럴처럼 행동
    names[1] = "lee";
    names[2] = "park";
    for (String name: names) {
      System.out.println(name);
    }

  }


}
