package Chapter6;

public class FinalClassEx {
  public static void main(String[] args) {
    new Better();
    new Good();
    new Best();
  }
}

class Good {

}

class Better extends Good{

}

final class Best extends Better{

}
