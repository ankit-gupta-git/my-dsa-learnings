public class Polymorphism {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        System.out.println(calc.sum(2, 3));
        System.out.println(calc.sum(2.5f, 3.5f));
        System.out.println(calc.sum(2, 3, 4));
        
        Deer d = new Deer(); //Child class object 
        d.eat();
    }
}

//Method Overriding #Run time polymorphism
class Animal {
    void eat(){
        System.out.println("animal eats");
    }

    void breathe() {
        System.out.println("animal breathes");
    }
}

class Deer extends Animal {
    void eat(){
        // super.eat(); //Method overriding
        System.out.println("Deer eats grass");
    }
}

//Method Overloading #Compile time polymorphism
class Calculator {
    int sum (int a, int b){
        return a + b;
    }

    float sum (float a, float b){
        return a + b;
    }

    int sum (int a, int b, int c){
        return a + b + c;
    }
}

