package sample;

/**
 * Hello sample class
 * main-method
 * \hello를 출력하는 프로그램
 */
public class Hello {
  public static void main(String[] args) {
  char zero = '0';
  char three = 3 + '0';
  int i = '3' - '0';
  String str3 = 3.0 + "";
  double d3 = Double.parseDouble(str3);
  double res = d3 + 10;
  String str = "30";
  char c = str.charAt(0);
  System.out.println(c);

  double result =(double) 7/4;
    System.out.println(result);
    System.out.printf("i = %d and d3 = %.1f\n",i, d3);

    //print 출력 하고 행을 바꾸지 않음
    //printf()
    // Soutv 위 변수의 값을 바로 출력 해줌






//    String hello = "안녕!";
//    System.out.println("Hello World!");
//    System.out.println(hello);

  }
}
