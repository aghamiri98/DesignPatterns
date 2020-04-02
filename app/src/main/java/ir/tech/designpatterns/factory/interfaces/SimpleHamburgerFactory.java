package ir.tech.designpatterns.factory.interfaces;


import ir.tech.designpatterns.factory.model.BunLessBurger;
import ir.tech.designpatterns.factory.model.CheeseBurger;
import ir.tech.designpatterns.factory.model.GreekBurger;
import ir.tech.designpatterns.factory.model.Hamburger;
import ir.tech.designpatterns.factory.model.MeatLover;
import ir.tech.designpatterns.factory.model.VeggieBurger;

public class SimpleHamburgerFactory {
    public Hamburger createHamburger(String type){
        Hamburger burger = null;
        //We add types
        if (type.equals("cheese")) {
            burger = new CheeseBurger();
        } else if (type.equals("greek")) {
            burger = new GreekBurger();
        } else if (type.equals("meatLover")) {
            burger = new MeatLover();
        } else if (type.equals("veggie")) {
            burger = new VeggieBurger();
        } else if (type.equals("bunLess")) {
            burger = new BunLessBurger();
        }

        return burger;


    }
}
