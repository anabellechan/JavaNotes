package InterfaceExample.src;

public class Cat implements AnimalBehavior {
    public void eat() {
        System.out.println("Cat is eating");
    }

    public void sleep() {
        System.out.println("Cat is sleeping");
    }
}
