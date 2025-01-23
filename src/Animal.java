/**
 * Animal base
 *
 * @author Marco Bejarano Oseguera
 * @version 1/22/2025
 */

public abstract class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("Eating...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }

    public abstract void makeSound();

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        eat();
        sleep();
        makeSound();
    }
}
