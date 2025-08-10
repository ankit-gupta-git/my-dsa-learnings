public class ConstHeirarchy {
    public static void main(String[] args){
        Mustang myHorse = new Mustang();
        //Animal -> Horse -> Mustang
    }
}

class Animal {  //we can't  create object of animal class
    Animal() {
        System.out.println("Animal constructor called");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor called");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called");
    }
}
