package Strings;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");  //modifies the existing StringBuilder object instead of creating a new one.
        for(char ch = 'a'; ch <= 'z'; ch++){
            sb.append(ch); 
        }

        System.out.println(sb);

    }
    
}
