package Chapter7;

public interface Delicious extends Edible, Sweetable {
}

interface Edible{
  void eat();
}
interface Sweetable{
  void sweet();
}
