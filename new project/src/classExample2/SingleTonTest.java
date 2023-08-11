package classExample2;

public class SingleTonTest {
  public static void main(String[] args) {
    SingleTon singleTon1 = SingleTon.getInstance();
    SingleTon singleTon2 = SingleTon.getInstance();
    System.out.println(singleTon1);
    System.out.println(singleTon2);
  }
}
