/**
 * Cat class
 *
 * @author  Marco Bejarano Oseguera
 * @version 1/22/2025
 */

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Sound: Meow meow");
    }

    public void behavior() {
        System.out.println("Behaviour: mean");
    }

}
