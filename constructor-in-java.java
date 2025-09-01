class Student {
    String name;
    int age;

    // Default Constructor (no parameters)
    Student() {
        name = "Unknown";
        age = 0;
        System.out.println("Default Constructor Called");
    }
    //Parameterized constructor 1
    Student(String n){
        this.name= n;
        age=0;
    }
    //Parameterized constructor 2
    Student (String n, int a){
        this.name= n;
        this.age= a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        // When we create object, default constructor is called automatically
        Student s1 = new Student(); 
        s1.display();

        Student s2 = new Student("Himanshu"); 
        s2.display();
        
        Student s3 = new Student("Himanshu", 22); 
        s3.display();
    }
}
