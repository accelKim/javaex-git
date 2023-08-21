package Chapter7;

public class Coin1Demo {
  public static void main(String[] args) {
    System.out.println("Dime은 " + Coin.DIME + "센트입니다.");
  }
}

interface  Coin{
  int PENNY =1, NICKEL = 5, DIME = 10, QUATER = 25;
}