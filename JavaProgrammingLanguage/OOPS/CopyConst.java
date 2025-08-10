package OOPS;
public class CopyConst {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "ankit";
        s1.roll = 456;
        s1.password = "ABC";

        Student s2 = new Student(s1);
        s2.password = "BCD";

        // Print s2 values
        System.out.println("Name: " + s2.name);
        System.out.println("Roll: " + s2.roll);
        System.out.println("Password: " + s2.password);
    }
}

class Student {
    String name;
    int roll;
    String password;

    // Copy constructor
    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
        // optionally add: this.password = s1.password;
    }

    Student() {
        System.out.println("constructor is called ...");
    }
}

