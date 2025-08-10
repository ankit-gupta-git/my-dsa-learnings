package OOPS;

public class Oops {
    public static void main(String[] args){
        Pen p1 = new Pen(); // created a pen object called  p1
        p1.setColor("Blue"); //use . to access func of properties
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
  
        BankAccount myAcc = new BankAccount();
        myAcc.username = "jane";
        myAcc.setPassword("jane@123");
    }
}


class BankAccount {
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    } 
}

class Student {
    String name;
    int age;
    float percentage; //cgpa

    void calculatePercentage(int phy, int chem, int math){
        percentage = (phy + chem + math) / 3;
    }
}