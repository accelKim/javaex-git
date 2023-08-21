package Chapter7;

public class AnimalDemo {
  public static void main(String[] args) {
    Dog dog = new Dog();
    Cockoo cockoo = new Cockoo();

    makeSound(dog);
    makeSound(cockoo);
  }

  private static void makeSound(Animal animal) {
    animal.sound();
    if (animal instanceof Dog) {
      ((Dog) animal).run();
    } else if (animal instanceof Cockoo) {
      ((Cockoo) animal).fly();
    }
  }
}

  interface Animal {
    void sound();


  }

  class Dog implements Animal {
    @Override
    public void sound() {
      System.out.println("멍멍");
    }

    public void run() {
      System.out.println("달린다");
    }
  }

  class Cockoo implements Animal {
    @Override
    public void sound() {
      System.out.println("뻐꾹뻐꾹");
    }

    public void fly() {
      System.out.println("날다");
    }
  }


