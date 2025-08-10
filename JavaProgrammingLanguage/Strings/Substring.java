package Strings;

public class Substring {
    public static String subString(String str, int si, int ei) {
        String substr = "";
        for (int i = 0;  i < ei; i++){
            substr = substr + str.charAt(i);
        }
        return substr; 
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        //Substring
        System.out.println(str.substring(0, 7));
        // System.out.println(subString(str, 0, 5));
    }
}
