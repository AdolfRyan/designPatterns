package factory.pizza;

public class ChicagoStylePizzaStore extends PizzaStore {
  Pizza createPizza(String item) {
    if (item.equals("cheese")) {
      return new ChicagoStyleCheesePizza();
    } 
    return null;
  }
}
