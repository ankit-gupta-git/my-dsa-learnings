public class Super {
    public static void main(String[] args){
        Mammal m = new Mammal();
    }
}

class Animal {
    Animal(){
        System.out.println("Animal class constructor");
    }
}

class Mammal extends Animal {
    Mammal(){
        super(); //super() is used to call the constructor of the parent class
        System.out.println("Mammal class constructor");
    }
}

