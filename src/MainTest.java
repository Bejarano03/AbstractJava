import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class MainTest {
   Dog myDog;
   Cat myCat;
   Bird myBird;

   @BeforeEach
   void setUp() {
      myDog = new  Dog("Firulais", 2);
      myCat = new  Cat("Jerry", 3);
      myBird  = new  Bird("Gretel", 5);
   }

   @Test
   void  testDisplayInfo() {
      myDog.displayInfo();
      myCat.displayInfo();
      myBird.displayInfo();
   }

   @Test
   void  testBehavior() {
      myDog.behavior();
      myCat.behavior();
      myBird.behavior();
   }

   @Test
   void testNameAndAgeInitialization() {
      // Test constructor sets values correctly.
      assertEquals("Firulais", myDog.name, "Name should be Firulais");
      assertEquals(2, myDog.age, "Age should be 2");
      assertEquals("Jerry", myCat.name, "Name should be Jerry");
      assertEquals(3, myCat.age, "Age should be 3");
      assertEquals("Gretel", myBird.name, "Name should be Gretel");
      assertEquals(5, myBird.age, "Age should be 5");
   }
}