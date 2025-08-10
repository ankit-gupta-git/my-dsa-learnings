package OOPS;

public class GetSet {
    public static void main(String[] args){
        Pen p1 = new Pen(); // created a pen object called  p1
        p1.setColor("Blue"); //use . to access func of properties
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
    }
}

class Pen{
    String color;
    private int tip;

    String getColor() {
        return this.color; //current object
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor){
        this.color = newColor;
    }

    void setTip(int newTip){
        this.tip = newTip;
    } 
}
