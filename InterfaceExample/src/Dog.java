package InterfaceExample.src;

public class Dog implements AnimalBehavior{
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}
