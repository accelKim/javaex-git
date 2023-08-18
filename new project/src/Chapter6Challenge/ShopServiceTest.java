package Chapter6Challenge;

public class ShopServiceTest {
  public static void main(String[] args) {
    ShopService s1 = ShopService.getInstance();
    ShopService s2 = ShopService.getInstance();

      if (s1 == s2) {
        System.out.println("같은 ShopService 객체입니다");
      } else {
        System.out.println("다른 ShopService 객체 입니다");
      }
    }
  }

