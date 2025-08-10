package Strings;
import java.util.*;

public class Strings {
    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " "); //to find index of characters in Strings
        }
        System.out.println();
    }
    public static void main(String[] args) {
            //Strings are IMMUTABLE
    Scanner sc = new Scanner(System.in);
    String name;
    name = sc.nextLine();
    System.out.println(name);
    System.out.println(name.length()); //To print length of the string

    //Conactenation
    String name1 = "Hello";
    String name2 = "World";
    String fullName = name1 + " " + name2;
    System.out.println(fullName + " is this");

    printLetters(fullName);
}
    }
