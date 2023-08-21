package Chapter7;

public class EagleTest {
  public static void main(String[] args) {
    ABird e = new ABird(){
      public void fly() {
        System.out.println("독수리가 날아가다");
      }
    };
    e.fly();
  }
}



