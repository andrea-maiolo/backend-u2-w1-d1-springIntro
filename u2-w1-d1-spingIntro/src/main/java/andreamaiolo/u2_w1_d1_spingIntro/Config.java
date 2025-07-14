package andreamaiolo.u2_w1_d1_spingIntro;

import andreamaiolo.u2_w1_d1_spingIntro.entities.Drinks;
import andreamaiolo.u2_w1_d1_spingIntro.entities.Menu;
import andreamaiolo.u2_w1_d1_spingIntro.entities.Pizzas;
import andreamaiolo.u2_w1_d1_spingIntro.entities.Toppings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Drinks getCoke() {
        return new Drinks("coke", 3.5, 200);
    }

    @Bean
    public Drinks getWater() {
        return new Drinks("water", 2.5, 0);
    }

    @Bean
    public Drinks getFanta() {
        return new Drinks("fanta", 3.5, 150);
    }

    @Bean
    public Toppings getHam() {
        return new Toppings("ham", 1.00, 100);
    }

    @Bean
    public Toppings getSalame() {
        return new Toppings("salame", 1.50, 350);
    }

    @Bean
    public Toppings getMushrooms() {
        return new Toppings("mushrooms", 2.10, 150);
    }

    @Bean
    public Toppings getAnchovies() {
        return new Toppings("anchovies", 2.30, 300);
    }

    @Bean
    public Toppings getTomato() {
        return new Toppings("tomato", 0.00, 0);
    }

    @Bean
    public Toppings getMozzarella() {
        return new Toppings("mozzarella", 0.00, 0);
    }

    @Bean
    public Pizzas getMargherita() {
        Pizzas base = new Pizzas("margherita", 5.00, 500);
        base.addTopping(getMozzarella());
        base.addTopping(getTomato());
        return base;
    }

    @Bean
    public Pizzas getHamMushrooms() {
        Pizzas base = new Pizzas("prosciutto e funghi", 7.00, 500);
        base.addTopping(getMozzarella());
        base.addTopping(getTomato());
        base.addTopping(getHam());
        base.addTopping(getMushrooms());
        return base;
    }

    @Bean
    public Pizzas getSiciliana() {
        Pizzas base = new Pizzas("siciliana", 8.00, 500);
        base.addTopping(getMozzarella());
        base.addTopping(getTomato());
        base.addTopping(getAnchovies());
        return base;
    }

    @Bean
    public Menu getFullMenu() {
        Menu newMenu = new Menu();
        newMenu.addDrink(getCoke());
        newMenu.addDrink(getFanta());
        newMenu.addDrink(getWater());
        newMenu.addPizza(getMargherita());
        newMenu.addPizza(getHamMushrooms());
        newMenu.addPizza(getSiciliana());
        newMenu.addtopping(getAnchovies());
        newMenu.addtopping(getMushrooms());
        newMenu.addtopping(getHam());
        newMenu.addtopping(getSalame());
        return newMenu;
    }
}