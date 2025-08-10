public class Inheritance {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat();
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}


//Base Class
class Animal {
    String color;

    void eat(){
        System.out.println("animal eats");
    }

    void breathe() {
        System.out.println("animal breathes");
    }
}

//Multi level inheritence
class Mammal extends Animal {
    int legs;
}

class Dog extends Mammal {
    String name;
}


//#Hierarchial inheritance
class Mammal extends Animal {
    void walk() {
        System.out.println("walks");
}

class Fish extends Animal {
    void swim() {
        System.out.println("swims");
}

class Bird extends Animal {
    void fly() {
        System.out.println("flies")
}



//Derived class #subclass | Single level inheritence
class Fish extends Animal{
    int fins;

    void swim() {
        System.out.println("fish can swim in water");
    }
