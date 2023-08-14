package Chapter5;

public class ArrayEx {
  public static void main(String[] args) {
    int sum = 0;
    int avg = 0;
    int sc1 = 90;
    int sc2 = 80;
    int sc3 = 100;

    sum = sc1 + sc2 + sc3;
    avg = sum/3;

    sum =0;
    avg=0;

//    int[] scores = new int[3];
//    scores[0] = 90;
//    scores[1] = 80;
//    scores[2] = 100;
//    sum = scores[0] + scores[1] + scores[2];
    int[] scores = {90, 80, 100};

    for (int i = 0; i < scores.length; i++) {
      sum += scores[i];
    }
    avg = sum / scores.length;
    System.out.printf("sum = %d , avg = %d\n", sum, avg);

    int[] scoresBig = new int[5]; // 배열을 사용하다 부족할때 더큰 배열로 늘리는법
    for (int i = 0; i < scores.length; i++) {
      scoresBig[i] = scores[i];
    }
    scores = scoresBig;
    scores[3]=110;
    for (int i = 0; i < scores.length; i++) {
      System.out.println(scores[i]);
    }
    for (int score : scores) { //foreach 사용법 scores 의 값을 int score로 socres가 빌때 까지 옮긴다
      System.out.println(score);
    }
  }
}
