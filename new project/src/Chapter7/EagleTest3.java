package Chapter7;

public class EagleTest3 {
  //멤버 클래스
  ABird b = new ABird();

    public void fly () {
    System.out.println("Eagle fly away");
  }



    //메서드
    public static void main (String[]args){
    EagleTest3 eagleTest3 = new EagleTest3();
    eagleTest3.b.fly();
  }
}

