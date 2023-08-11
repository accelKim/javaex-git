package classExample;

public class Course {
 private String id = "";
 private String name = "";
 private int numberOfStudent;

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getNumberOfStudent() {
    return numberOfStudent;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void addStudent(int student) {
    numberOfStudent += student;
  }
  public void deleteStudent(int student) {
    numberOfStudent -= student;
  }

}
