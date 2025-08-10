package Strings;

import java.lang.module.ModuleDescriptor.Builder;

//For a given string convert each the first letter of each word to uppercase.
public class Qs4 {
    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase( 
        sb.append(ch);
        
        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == ' ' && i < str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.CharAt(i));
        }

        return sb.toString();

    }
    public static void main(String[] args) {
        String str = "hi, i am ankit";
        System.out.println(toUpperCase(str));
    }
}