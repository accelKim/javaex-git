package Challenge;

public class No1 {
  public static void main(String[] args) {
    System.out.println(countChar("heLlo java", 'l'));
  }

  //
//  static int countChar(String s, char c) {
//    return s.length() - s.replace(String.valueOf(c), "").length();
//  }
  static int countChar(String s, char c) {
    int count = 0;

    for (int i = 0; i < s.length(); i++) {
      if (Character.toUpperCase(c) == s.toUpperCase().charAt(i)) {
        count++;
      }
    }
    return count;
  }
}



