package ir.tech.designpatterns.singleton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ir.tech.designpatterns.R;

public class SingletonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton);

        MyClass myClass = MyClass.getInstance();


        myClass.name = "Class";

        System.out.println(myClass);





//        System.out.println("Second instance " + secondClass);
//
//        System.out.println("Object person: " + person);
//
//        System.out.println("Second Object person: " + secondPerson);


    }
}
