package ir.tech.designpatterns.observer.model;


import ir.tech.designpatterns.observer.interfaces.Observer;
import ir.tech.designpatterns.observer.interfaces.Subject;

public class EmailTopicSubscriber implements Observer {
    private String name;
    private Subject topic;


    public EmailTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {

        String msg = (String) topic.getUpdate(this);
        if (msg == null) {
            System.out.println(name + "No New message on this topic");
        } else {
            System.out.println(name + "Rertriveing message: " + msg);
        }

    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}
