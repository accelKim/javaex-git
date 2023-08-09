package sample;

import java.util.Scanner;

public class InputOutput {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
//    int i = in.nextInt();
//    System.out.println(i);

//    String s = in.nextLine();
//    int i2 = Integer.parseInt(s);
//    System.out.println(i2);

    int a = 1_000_000;
    int b = 2_000_000;
    long c = (long) a * b;
    System.out.println(c);

    double res = 5/0.0;
    double r = 5 % 0.0;
    boolean b1 = Double.isInfinite(res);
    boolean b2 = Double.isNaN(r);
    System.out.println("res = " + (res +2));
    System.out.println("r = " + (r+2));
    System.out.println("b2 = " + b1);
    System.out.println("b1 = " + b2);


  }
}
