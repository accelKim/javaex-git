package Chapter6Challenge;

public class PrintEXTest {
  public static void main(String[] args) {
    Printer printer = new Printer();
    printer.println(10);
    printer.println(true);
    printer.println(5.7);
    printer.println("홍길동");
  }
}

class Printer{
  void println(int i){
    System.out.println(i);
  }
  void println(boolean a){
    System.out.println(a);
  }
  void println(double d){
    System.out.println(d);
  }
  void println(String c){
    System.out.println(c);
  }
}
