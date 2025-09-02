// Parent class
class Parent {
    String name = "Parent Variable";

    // Default constructor
    Parent() {
        System.out.println("Parent default constructor called");
    }

    // Parameterized constructor
    Parent(String msg) {
        System.out.println("Parent parameterized constructor called with: " + msg);
    }

    void display() {
        System.out.println("Parent method");
    }
}

// Child class
class Child extends Parent {
    String name = "Child Variable";

    // Default constructor -> explicitly calls parent default constructor
    Child() {
        super(); // compiler adds this automatically if not written
        System.out.println("Child default constructor called");
    }

    // Parameterized constructor -> explicitly calls parent parameterized constructor
    Child(String msg) {
        super(msg); // must be first statement
        System.out.println("Child parameterized constructor called with: " + msg);
    }

    @Override
    void display() {
        // Access parent variable
        System.out.println("Accessing parent variable: " + super.name);

        // Call parent method
        super.display();

        // Access child variable
        System.out.println("Accessing child variable: " + this.name);

        System.out.println("Child method");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        System.out.println("== Creating Parent Object ==");
        Parent p = new Parent();
        p.display();

        System.out.println("\n== Creating Child Object with default constructor ==");
        Child c1 = new Child();
        c1.display();

        System.out.println("\n== Creating Child Object with parameterized constructor ==");
        Child c2 = new Child("Hello Super");
        c2.display();
    }
}


/*
OUTPUT :

== Creating Parent Object ==
Parent default constructor called
Parent method

== Creating Child Object with default constructor ==
Parent default constructor called
Child default constructor called
Accessing parent variable: Parent Variable
Parent method
Accessing child variable: Child Variable
Child method

== Creating Child Object with parameterized constructor ==
Parent parameterized constructor called with: Hello Super
Child parameterized constructor called with: Hello Super
Accessing parent variable: Parent Variable
Parent method
Accessing child variable: Child Variable
Child method
*/