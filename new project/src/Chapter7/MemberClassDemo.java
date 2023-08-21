package Chapter7;

public class MemberClassDemo {
  // 필드
  private String secret = "비공개";
  //멤버 - 클래스
  String s = "외부";
  // 멤버 - 메서드
  class MemberClass{
    //멤버 - 필드
    String s = "내부";
    //멤버 - 메서드
    public void show() {
      System.out.println("inner class");
      System.out.println(secret);
      System.out.println(s);
      System.out.println(MemberClassDemo.this.s);
    }
  }
//멤버 - 메서드
  public static void main(String[] args) {
    MemberClassDemo m = new MemberClassDemo();
    System.out.println(m.s);
    System.out.println(m.secret);
    MemberClassDemo.MemberClass mm = m.new MemberClass();
    System.out.println(mm.s);
    mm.show();
  }
}
