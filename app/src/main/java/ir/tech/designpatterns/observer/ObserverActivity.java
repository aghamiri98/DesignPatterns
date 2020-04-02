package ir.tech.designpatterns.observer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ir.tech.designpatterns.R;
import ir.tech.designpatterns.observer.interfaces.Observer;
import ir.tech.designpatterns.observer.model.EmailTopic;
import ir.tech.designpatterns.observer.model.EmailTopicSubscriber;

public class ObserverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer);

        EmailTopic topic = new EmailTopic();



        //create observers
        Observer firstObserver = new EmailTopicSubscriber("FirstObserver");

        Observer secondObserver = new EmailTopicSubscriber("secondObserver");

        Observer thirdObserver = new EmailTopicSubscriber("thirdObserver");

        //Register them...
        topic.register(firstObserver);
        topic.register(secondObserver);
        topic.register(thirdObserver);

        // Attaching observer to subject
        firstObserver.setSubject(topic);
        secondObserver.setSubject(topic);
        thirdObserver.setSubject(topic);


        //Check for updates
        firstObserver.update();
        thirdObserver.update();


        //Provider/ Subject ( broadcaster)
        topic.postMessage("Hello Subscribers!");


        topic.unregister(firstObserver);

        topic.postMessage("Hello Subscribers!");











    }
}
