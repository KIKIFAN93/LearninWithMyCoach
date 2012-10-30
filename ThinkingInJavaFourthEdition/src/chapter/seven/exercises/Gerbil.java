package chapter.seven.exercises;

/**
 * Exercise 9:  (3) Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster, etc. In the base class,
 *      provide methods that are common to all Rodents, and override these in the derived classes to perform
 *      different behaviors depending on the specific type of Rodent. Create an array of Rodent, fill it with
 *      different specific types of Rodents, and call your base-class methods to see what happens.
 *
 *      @see Rodent
 *      @see Hamster
 *      @see ExercisesSeven
 *      @see Mouse
 */
public class Gerbil extends Rodent {

    public void move() {
        System.out.println("To the pellet dish");
    }

    public void gnaw() {
        System.out.println("Into the pellets.");
    }
}