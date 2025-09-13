class Student{
    String name;
    long rollno;
    char section;
    String branch;
    Student(String name, long rollno, char section, String branch){
        this.name= name;
        this.rollno= rollno;
        this.section= section;
        this.branch= branch;
    }
    public String toString(){
        return "Name: "+name+"\nBranch: "+branch+"\nRoll No: "+rollno+"\nSection: "+section;
    }
    public static void main(String[] args){
        Student s= new Student("Himanshu Sekher Padhy", 2202082, 'A', "CSE");
        System.out.print(s); // same as s.toString()
    }
}