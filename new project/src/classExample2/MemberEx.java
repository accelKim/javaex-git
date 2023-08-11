package classExample2;

public class MemberEx {
  public static void main(String[] args) {
    Member m = new Member("김원호", "kim", "a1234", 130);
    m.setAge(26);
    System.out.printf("%s 의 나이는 %d 입니다", m.getName(), m.getAge());
  }
}
