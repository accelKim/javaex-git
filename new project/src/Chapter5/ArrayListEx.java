package Chapter5;

import java.util.ArrayList;

public class ArrayListEx {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(); // Wrapper 클래스//빈 문자열이라도 넣어야 참조가 가능
    System.out.println(numbers);
    numbers.add(10);
    System.out.println(numbers);
    numbers.add(9);
    System.out.println(numbers);
    numbers.add(8);
    System.out.println(numbers);
    numbers.add(0, 11);
    System.out.println("numbers = " + numbers);
    System.out.println(numbers.size());
    numbers.remove(1);
    System.out.println("numbers = " + numbers);
    System.out.println(numbers.get(2));

  }
}
