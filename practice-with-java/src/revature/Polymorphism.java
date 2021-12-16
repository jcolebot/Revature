package revature;

public class Polymorphism {

    // Polymorphism means "many forms"
    // It occurs when we have many classes that are related to each other by inheritance.
    // Inheritance lets us inherit attributes and methods from another class.
    // Polymorphism uses those methods to perform different tasks.
    // This allows us to perform a single action in different ways.

    // For example, think of a superclass called Animal that has a method called animalSound().
    // Subclasses of Animals could be Pigs, Cats, Dogs, Birds
    // And they have their own implementation of an animal sound (the pig oinks, and the cat meows, etc.)

    // example
    class Animal {
        public void animalSound() {
            System.out.println("The animal makes a sound");
        }
    }

    class Pig extends Animal {
        public void animalSound() {
            System.out.println("The pig says: wee wee");
        }
    }

    class Dog extends Animal {
        public void animalSound() {
            System.out.println("The dog says: bow wow");
        }
    }
}
