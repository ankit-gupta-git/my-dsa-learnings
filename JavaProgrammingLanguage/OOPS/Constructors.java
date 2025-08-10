package OOPS;
public class Constructors {  //invoked automatically at the time of object creation (used to initialse a object)
    public static void main(String[] args){
        Student s1 = new Student("Ankit"); //pass name as a parameter
        System.out.println(s1.name);
    }
}

class Student {
     String name;
     int roll;

     Student(String name) {
        this.name = name;
     }
}
