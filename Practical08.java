


/*			Title: Develop a program for implementation of
			a) method overriding.
			b) method overloading
			Assignment : Practical 08
			Date:24/10/2023                            Enrollment No:2106207             */
/*
//Method overriding		
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

public class Practical08{
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();

        animal.makeSound(); // Calls the method in Animal class
        dog.makeSound();    // Calls the overridden method in Dog class
    }
}
*/
//Method overloading
public class Practical08 {
    // Method with two integer parameters
    static int add(int a, int b) {
        return a + b;
    }

    // Method with three integer parameters
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        int sum1 = add(5, 10);
        int sum2 = add(5, 10, 15);

        System.out.println("Sum of two numbers: " + sum1);
        System.out.println("Sum of three numbers: " + sum2);
    }
}
