package classExample;

public class Phone {
  private static long numberOfPhones;
  String model;
  int value;

 //public Phone() { }
  public  Phone(String model, int value) {
    this.model = model;
    this.value = value;
    numberOfPhones++;
  }

  public static long getNumberOfPhones() {
    return numberOfPhones;
  }

  void print(){
    System.out.println(value + "원 짜리 " + model + "의 스마트폰임");
  }
}
