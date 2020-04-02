package ir.tech.designpatterns;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import ir.tech.designpatterns.factory.FactoryActivity;
import ir.tech.designpatterns.observer.ObserverActivity;
import ir.tech.designpatterns.singleton.SingletonActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnObserver = findViewById(R.id.btnObserver);
        btnObserver.setOnClickListener(this);
        Button btnSingleton = findViewById(R.id.btnSingleton);
        btnSingleton.setOnClickListener(this);
        Button btnFactory = findViewById(R.id.btnFactory);
        btnFactory.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnObserver) {
            Intent intent = new Intent(MainActivity.this, ObserverActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btnSingleton) {
            Intent intent = new Intent(MainActivity.this, SingletonActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btnFactory) {
            Intent intent = new Intent(MainActivity.this, FactoryActivity.class);
            startActivity(intent);
        }


    }
}
