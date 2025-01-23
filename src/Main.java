/**
 * Program uses different packages and
 * inherits methods from a base Animal package.
 *
 * @author Marco Bejarano Oseguera
 * @version 1/22/2025
 */

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Bob", 12);
        System.out.println("My Dog");
        myDog.displayInfo();
        myDog.behavior();
        System.out.println();

        Cat myCat = new Cat("Sean", 2);
        System.out.println("My Cat");
        myCat.displayInfo();
        myCat.behavior();
        System.out.println();

        Bird myBird = new Bird("Ross", 5);
        System.out.println("My Bird");
        myBird.displayInfo();
        myBird.behavior();
    }
}