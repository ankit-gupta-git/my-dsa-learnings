

//wap to count numbers in an array input by user
public class CountNos {
    static int count(int numbers[], int i){
        if(i == numbers.length){
            return 0;
        }
        return 1 + count(numbers, i+1);
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        System.out.println("Total numbers: " + count(numbers, 0));
    }
}
