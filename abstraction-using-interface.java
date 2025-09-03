interface MyInterface {
    // 1. Constant (public static final by default)
    int VALUE = 100;

    // 2. Abstract Method (public abstract by default)
    void abstractMethod();

    // 3. Default Method (Java 8+)
    default void defaultMethod() {
        System.out.println("Default method in interface");
    }

    // 4. Static Method (Java 8+)
    static void staticMethod() {
        System.out.println("Static method in interface");
    }

    // 5. Private Method (Java 9+)
    private void privateHelper() {
        System.out.println("Private helper method (only used inside interface)");
    }

    // Calling private method from another default method
    default void usePrivateHelper() {
        System.out.print("Using private helper -> ");
        privateHelper();
    }
}

// Implementation Class
class DemoClass implements MyInterface {
    // Must implement abstract method
    public void abstractMethod() {
        System.out.println("Implemented abstract method in class");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        // Create object of implementing class
        DemoClass obj = new DemoClass();

        // Call abstract method (implemented by class)
        obj.abstractMethod();

        // Call default method
        obj.defaultMethod();

        // Call default method that uses private method internally
        obj.usePrivateHelper();

        // Call static method directly using interface name
        MyInterface.staticMethod();

        // Access constant
        System.out.println("Constant VALUE = " + MyInterface.VALUE);
    }
}
