package adapter;

public class DuckTestDrive {
  public static void main(String[] args) {
    MallardDuck duck = new MallardDuck();

    WildTurkey turkey = new WildTurkey();
    Duck turkeyAdapter = new TurkeyAdapter(turkey);

    System.out.println("The Turkey says...");
    turkey.gobble();
    turkey.fly();

    System.out.println("\n The TurkeyAdapter says...");
    testDuck(turkeyAdapter);

    System.out.println("\n The Duck says...");
    testDuck(duck);
  }

  static void testDuck(Duck duck) {
    duck.quack();
    duck.fly();
  }
}

