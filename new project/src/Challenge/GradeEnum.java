package Challenge;

public enum GradeEnum {
  A("Excellent"), B("Good"), C("SoSo");

  private String grade;

  private GradeEnum(){}

  private GradeEnum(String grade) {
    this.grade = grade;
  }
  public String getGrade(){
    return grade;
  }
}
