package classExample2;

public class Member {
 private String name;
  private String id;
  private String password;
  private   int age;

  public Member(String name, String id, String password, int age) {
    this.name = name;
    this.id = id;
    this.password = password;
    this.age = age;
  }
  public String getName() {
    return name;
  }

  public String getId() {
    return id;
  }

  public String getPassword() {
    return password;
  }

  public int getAge() {
    return age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
  if (age > 100 || age <= 0) {
    System.out.println("나이는 100보다 크거나 0보다 작거나 같을수 없습니다.");
    return;
  }
    this.age = age;
  }
}
