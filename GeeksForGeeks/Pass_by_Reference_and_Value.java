package GeeksForGeeks;

public class Pass_by_Reference_and_Value {
    static int[] passedBy(int a, int b) {
        // code here
        a = a + 1; 
        b = b + 2; 
        return new int[]{a, b};
        
    }
}
