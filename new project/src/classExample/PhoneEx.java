package classExample;

public class PhoneEx {
  public static void main(String[] args) {
    Phone myPhone = new Phone("galxy s 23 ", 1_000_000);
    System.out.println(Phone.getNumberOfPhones() + "대가 생성되었습니다.");
    myPhone.print();
    System.out.println(myPhone.getNumberOfPhones());
    
    Phone yourPhone = new Phone("IPhone", 1_200_000);
    System.out.println(Phone.getNumberOfPhones() + "대가 생성되었습니다.");
    yourPhone.print();
    System.out.println(yourPhone.getNumberOfPhones());
  }
}
