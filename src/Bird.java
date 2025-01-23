/**
 * Bird class
 *
 * @author Marco  Bejarano Oseguera
 * @version 1/22/2025
 */

public class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Sound: Chirp chirp");
    }

    public void behavior() {
        System.out.println("Behaviour: flies away");
    }
}
