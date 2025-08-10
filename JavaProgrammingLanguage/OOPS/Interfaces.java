public class Interfaces {
    public static void main(String[] args){
        Queen q = new Queen();
        q.moves();

        Bear b = new Bear();
        b.eatGrass();
        b.eatMeat();
    }
}

//Multiple Inheritence 
interface Hervibore {
    void eatGrass();
}

interface Carnivore {
    void eatMeat();
}

//Multiple inheritence
class Bear implements Hervibore, Carnivore {
    public void eatGrass(){
        System.out.println("Bear eats grass");
    }
    public void eatMeat(){
        System.out.println("Bear eats meat");
    }
}


interface ChessPlayer {
    void moves(); //abstract method 
}

class Queen implements ChessPlayer {
    public void moves(){
        System.out.println("Up, down, left, right , diagonal, all 4 directions");
    }
}

class Rook implements ChessPlayer {
    public void moves(){
        System.out.println("Up, down, left, right");
    }
}

class King implements ChessPlayer {
    public void moves(){
        System.out.println("Up, down, left, right, diagonal - (by 1 step)");
    }
}