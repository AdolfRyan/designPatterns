package factory.pizza;

public class PizzaTestDrive {
  public static void main(String[] args) {
    PizzaStore nyStore = new NYPizzaStore();
    PizzaStore chicagoStore = new ChicagoStylePizzaStore();

    Pizza pizza = nyStore.orderPizza("cheese");
    System.out.println("null ordered a " + pizza.getName() + "\n");

    pizza = chicagoStore.orderPizza("cheese");
    System.out.println("Ryoo ordered a " + pizza.getName() + "\n");
  }
}
