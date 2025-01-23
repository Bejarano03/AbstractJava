/**
 * Dog class
 *
 * @author Marco Bejarano Oseguera
 * @version 1/22/2025
 */

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Sound:  Woof woof");
    }

    public void behavior() {
        System.out.println("Behaviour:  docile");
    }
}
