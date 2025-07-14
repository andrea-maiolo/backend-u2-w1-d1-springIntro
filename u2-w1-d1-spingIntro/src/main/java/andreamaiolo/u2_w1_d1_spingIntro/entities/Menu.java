package andreamaiolo.u2_w1_d1_spingIntro.entities;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<Pizzas> allPizzas = new ArrayList<>();
    private List<Toppings> allToppings = new ArrayList<>();
    private List<Drinks> allDrinks = new ArrayList<>();

    public void addPizza(Pizzas pizza) {
        allPizzas.add(pizza);
    }

    public void addDrink(Drinks drink) {
        allDrinks.add(drink);
    }

    public void addtopping(Toppings topping) {
        allToppings.add(topping);
    }


    @Override
    public String toString() {
        return "Menu Pizzaria \n" +
                "Our pizzas: \n" +
                allPizzas +
                "our toppings: \n" +
                allToppings +
                "our drinks: \n" +
                allDrinks +
                '.';
    }
}