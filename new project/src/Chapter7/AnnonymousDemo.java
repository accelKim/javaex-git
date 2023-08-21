package Chapter7;

public class AnnonymousDemo {
  public static void main(String[] args) {
    //익명클래스 = 클래스의 선안과 객체의 생성을 동시에 하는 이름 없는 클래스(일회용)
    Parent p = new Parent() {
      };
    p.parent();
    }
  }



//class OnluOnce implements Parent {
//  @Override
//    System.out.println("Parent");
//  }

//  interface Parrnet {
//    void parent();
//  }
class Parent{
  void parent() {
    System.out.println("parent");
  }
}
