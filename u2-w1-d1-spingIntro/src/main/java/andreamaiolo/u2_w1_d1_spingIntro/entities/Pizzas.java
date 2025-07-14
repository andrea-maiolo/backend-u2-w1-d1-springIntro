package andreamaiolo.u2_w1_d1_spingIntro.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class Pizzas {
    private String name;
    private double price;
    private int calories;
    private List<Toppings> listOfToppings = new ArrayList<>();

    public Pizzas(String name, double price, int calories) {
        this.calories = calories;
        this.name = name;
        this.price = price;
    }

    public void addTopping(Toppings topping) {
        this.listOfToppings.add(topping);
        //calcolo calorie
        int toppingsCalories = listOfToppings.stream()
                .map(t -> t.getCalories())
                .reduce(0, (a, b) -> a + b);
        this.calories = 500 + toppingsCalories;
    }


}
