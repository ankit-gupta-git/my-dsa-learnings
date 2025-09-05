public class MergeSort {

    static void merge(int[] arr, int l, int mid, int r){

    int n1 = mid - l;
    int n2 = r - mid - 1;
    int[] left = new int[n1];
    int[] right = new int[n2];

    int i, j, k;
    
    for(i = 0;i<n1;i++) left[i]=arr[l+i];
    for(j = 0;j<n2;j++) right[j]=arr[mid+1+j];
    
    i=0;
    j=0;
    k=0;


    while(i<n1&&j<n2)
    {
        if (left[i] < right[j])
            arr[k++] = left[i++];
        else
            arr[k++] = right[j++];
    }while(i<n1)
    {
        arr[k++] = left[i++];
    }while(j<n2)
    {
        arr[k++] = right[j++];
    }
    }

    static void sort(int[] arr, int left, int right) {
        if (left >= right)
            return;
        int mid = (left + right) / 2;
        sort(arr, left, mid);
        sort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 6, 8, 7, 6, 9 };
        int n = arr.length;
        sort(arr, 0, n-1); 
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}
