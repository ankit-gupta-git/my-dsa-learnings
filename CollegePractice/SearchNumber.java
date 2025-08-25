public class SearchNumber {
    public static int search(int numbers[], int key, int i){
        if(i == numbers.length){
            return -1;
        }
        if(numbers[i] == key){
            return i;
        }    
        return search(numbers, key, i+1);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 10;
        System.out.println("Key found at index: " + search(numbers, key, 0));
    }
}