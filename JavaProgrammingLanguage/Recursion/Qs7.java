public class Qs7 {


    //printing of GFG without loop 
    static void printLetters(String str, int n){
        if(n <= 0) {
            return;
        }

        System.out.print(str + " ");
        printLetters(str, n-1);
    }
    public static void main(String[] args) {
        String str = "GFG";
        int n = 10;
        printLetters(str, n);
        
    }
}
