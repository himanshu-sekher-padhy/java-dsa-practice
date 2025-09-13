class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Student implements Cloneable {
    String name;
    Address address;

    Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Overriding clone() for shallow copy
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();  // shallow copy (default behavior)
    }
}

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Original object
        Student s1 = new Student("Himanshu", new Address("Delhi"));

        // Shallow copy
        Student s2 = (Student) s1.clone();

        // Print before modification
        System.out.println("Before modification:");
        System.out.println("s1 name: " + s1.name + ", city: " + s1.address.city);
        System.out.println("s2 name: " + s2.name + ", city: " + s2.address.city);

        // Modify the clone's address
        s2.address.city = "Mumbai";

        // Print after modification
        System.out.println("\nAfter modification:");
        System.out.println("s1 name: " + s1.name + ", city: " + s1.address.city);
        System.out.println("s2 name: " + s2.name + ", city: " + s2.address.city);
    }
}
