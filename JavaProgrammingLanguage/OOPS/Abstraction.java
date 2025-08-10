public class Abstraction {
    public static void main(String[] args){
        Dog dobby = new Dog();
        dobby.eat();
        dobby.breathe();
        // dobby.changeColor();
        System.out.println(dobby.color);


        Cat kitty = new Cat();
        kitty.eat();
        kitty.breathe();

        // Animal a = new Animal(); //got error if we try to create obj of an abstract class
    }
}

abstract class Animal {  //we can't  create object of animal class
    String color;

    Animal() {  //Constructor ka kaam apne child class ke obj ke liye variable ko initialise karna bhi ho sakta  hai 
        color = "brown";
    }
    void eat(){
        System.out.println("animal eats");
    }

    //just give an idea
    abstract void breathe(); //we can't define the implementation of this method
}

class Dog extends Animal {
    void changeColor() {
        color = "darkbrown";
    }
    void breathe() {
        System.out.println("dog breathes");  //Implementation
    }
}

class Cat extends Animal {
    void breathe() {
        System.out.println("cat breathes");   //Implementation
    }
}
