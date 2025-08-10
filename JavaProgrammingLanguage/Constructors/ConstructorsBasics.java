package Constructors;

public class ConstructorsBasics {
    public static void main (String[] args){
    Student s1 = new Student();
    Student s2 = new Student("Ankit");
    Student s3 = new Student(123);
   }
}


class Student {
    String name;
    int roll;

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