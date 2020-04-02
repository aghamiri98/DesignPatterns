package ir.tech.designpatterns.factory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ir.tech.designpatterns.R;
import ir.tech.designpatterns.factory.interfaces.HamburgerStore;
import ir.tech.designpatterns.factory.model.CheeseBurger;
import ir.tech.designpatterns.factory.model.Hamburger;
import ir.tech.designpatterns.factory.model.JamHamburgerstore;
import ir.tech.designpatterns.factory.model.MozHamburgerStore;

public class FactoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory);

        CheeseBurger cheeseBurger = new CheeseBurger();

        HamburgerStore mozambicanBurgerStore = new MozHamburgerStore();
        HamburgerStore jamaicanBurgerStore = new JamHamburgerstore();

        Hamburger hamburger = mozambicanBurgerStore.orderHamburger("cheese");
        System.out.println("Paulo ordered " + hamburger.getName() + "\n" );


        hamburger = jamaicanBurgerStore.orderHamburger("veggie");
        System.out.println("James Bond ordered: " + hamburger.getName() + "\n");


    }
}
