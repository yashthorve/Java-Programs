/*			Title: Develop programs for implementation of
			a) Single inheritance
 			b) multiple inheritance
                         	                     c) multilevel inheritance by applying various access
                                                                controls to its data members and methods
			Assignment : Practical 09
			Date:24/10/2023                            Enrollment No:2106207             */
/*


//Single Inheritance 
class Parent {
    void display() {
        System.out.println("This is the Parent class.");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("This is the Child class.");
    }
}

public class Practical09 {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
        child.show();
    }
}
//Multiple Inheritances
interface Interface1 {
    void method1();
}

interface Interface2 {
    void method2();
}

class MyClass implements Interface1, Interface2 {
    public void method1() {
        System.out.println("Method1 from Interface1");
    }

    public void method2() {
        System.out.println("Method2 from Interface2");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method1();
        obj.method2();
    }
}
*/
//Multilevel Inheritance
class Grandparent {
    public void publicMethod() {
        System.out.println("This is a public method in Grandparent.");
    }

    void defaultMethod() {
        System.out.println("This is a default (package-private) method in Grandparent.");
    }

    private void privateMethod() {
        System.out.println("This is a private method in Grandparent.");
    }
}

class Parent extends Grandparent {
    public void publicMethod() {
        System.out.println("This is a public method in Parent.");
    }

    void defaultMethod() {
        System.out.println("This is a default method in Parent.");
    }
}

class Child extends Parent {
    public void publicMethod() {
        System.out.println("This is a public method in Child.");
    }
}

public class Practical09 {
    public static void main(String[] args) {
        Child child = new Child();

        // Access methods from Child class
        child.publicMethod();
        child.defaultMethod(); // Can access default method in the same package
    }
}
