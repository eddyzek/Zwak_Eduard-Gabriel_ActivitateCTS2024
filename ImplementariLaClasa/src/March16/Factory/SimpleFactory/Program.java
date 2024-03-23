package March16.Factory.SimpleFactory;

public class Program {

    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        IPizza pizza = null;

        try {
            pizza = pizzaFactory.crearePizza(ETipPizza.ROMA);
        } catch (Exception e) {
            e.printStackTrace();
        }

        pizza.afisareDescriere();
    }
}
