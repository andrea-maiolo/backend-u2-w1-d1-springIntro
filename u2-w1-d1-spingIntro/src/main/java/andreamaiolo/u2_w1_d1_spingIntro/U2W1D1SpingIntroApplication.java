package andreamaiolo.u2_w1_d1_spingIntro;

import andreamaiolo.u2_w1_d1_spingIntro.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U2W1D1SpingIntroApplication {

    public static void main(String[] args) {
        SpringApplication.run(U2W1D1SpingIntroApplication.class, args);

        //  Drinks coca = new Drinks("coca", 3.45, 132);
        //  System.out.println(coca);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(U2W1D1SpingIntroApplication.class);

//        Toppings ham = context.getBean("getHam", Toppings.class);
//        System.out.println(ham);
//
//        Pizzas margherita = context.getBean("getMargherita", Pizzas.class);
//        System.out.println(margherita);

        Menu myMenu = context.getBean(Menu.class);
        System.out.println(myMenu);
        context.close();
    }
}
