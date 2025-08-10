package Constructors;

public class CopyConstructor {
    public static void main (String[] args){
        Student s1 = new Student();
        s1.name = "Ankit";
        s1.roll = 123;
        s1.password = 'abcd';

        Student s2 = new Student(s1);
       }
}

class Student {
    String name;
    int roll;
    String password;

    //copy constructor
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
        this.password = s1.password;  //copy constructor call  //passing object reference to the constructor  //pass by reference
        System.out.println("Copy constructor is called...");  //it will print twice because copy constructor is called twice (for s1 and s2)
    }

    
    Student() {     //Non-parameterized constructor
        System.out.println("Constructor is called...");
    }
    Student(String name) { //parameterized constructor 
        this.name = name;
    }
    Student(int roll) {
        this.roll = roll;
    }
}
