package Chapter7;
/**
 * implSprc :전자제품을 제어하기 위한 메소드
 */
public interface Controllable {
  /**
   *  @param : x
   *  @retrun : void
   *  @thorows : x
   *  @implSpec : 필요한 경우 오버라이드해서 사용하기
   */
  default void repair() {
    show("수리한다");
  }

  static void reset() {
    System.out.println("장비를 초기화 한다");
  }

  private void show(String s) {
    System.out.println(s);
  }

  void turnOn();

  void turnOff();
}
