package Chapter7Challenge;

public class Activity {
  public void onCreate() {
    System.out.println("기본적인 실행 내용");
  }
}

class MainActive extends Activity {
  @Override
  public void onCreate() {
    super.onCreate();
    System.out.println("추가적인 실행 내용");
  }
}

class ActivityTest {
  public static void main(String[] args) {
    MainActive mainActive = new MainActive();
    mainActive.onCreate();
  }
}