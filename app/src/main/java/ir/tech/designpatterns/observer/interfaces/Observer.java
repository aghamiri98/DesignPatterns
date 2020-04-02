package ir.tech.designpatterns.observer.interfaces;

public interface Observer {
    public void update();

    public void setSubject(Subject subject);
}
