class Student {
    String name;
    int age;

    // 1. Use of this to refer to current object variables
    Student(String name, int age) {
        this.name = name; // distinguish instance variable from parameter
        this.age = age;
    }

    // 2. Use of this to call another constructor (constructor chaining)
    Student(String name) {
        this(name, 18); // calls above constructor with default age = 18
    }

    // 3. Use of this to call current class method
    void showDetails() {
        this.display(); // calls display() method
    }

    void display() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }

    // 4. Use of this to pass current object as argument
    void printStudent() {
        Helper.print(this); // pass current object
    }

    // 5. this can be returned from a method
    Student getStudent() {
        return this;
    }
}

class Helper {
    static void print(Student s) {
        System.out.println("Helper printing: " + s.name + ", " + s.age);
    }
}

public class Main {
    public static void main(String[] args) {
        // Calls constructor with 2 args
        Student s1 = new Student("Himanshu", 22);

        // Calls constructor chaining
        Student s2 = new Student("Shu");

        // 1 & 2 checked already
        s1.display();
        s2.display();

        // 3. Call method using this
        s1.showDetails();

        // 4. Passing current object
        s1.printStudent();

        // 5. Returning current object
        Student s3 = s1.getStudent();
        System.out.println("Returned object is same as s1? " + (s1 == s3));
    }
}
