package andreamaiolo.u2_w1_d1_spingIntro.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Toppings {
    private String name;
    private double price;
    private int calories;

    public Toppings(String name, double price, int calories) {
        this.calories = calories;
        this.name = name;
        this.price = price;
    }

}
