package Chapter7;

public class EagleTest2 {
  //멤버 클래스
  class Eagle extends ABird{
    public void fly(){
      System.out.println("Eagle fly away");
    }
  }

  Eagle eagle = new Eagle();
  //메서드
  public static void main(String[] args) {
    EagleTest2 eagleTest2 = new EagleTest2();
  eagleTest2.eagle.fly();
  }
}
