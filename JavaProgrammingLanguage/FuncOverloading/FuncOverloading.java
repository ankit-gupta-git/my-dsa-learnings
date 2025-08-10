package FuncOverloading;

public class FuncOverloading {
    public static int sum(int x, int y) {
        return x + y;
    }

    // public static int sum(int x, int y, int z) {          throw error becoz of duplicate method
    public static int sum(int x, int y, int z) {  //func ovrloading only depends on parameters not in return type 
        return x + y + z;
    }

    public static double sum(float x, float y) {  //types of parameters or no of parameters must be different
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(sum(2, 3));
        System.out.println(sum(2, 3, 4));
        System.out.println(sum(2.5f, 3.5f));
    }
}




