import java.util.Arrays;

public class sorting_Algorithms {
    public static void bubble_Sort(int[] arr){
        for (int turn=0;turn< arr.length-1;turn++){
            int swap=0;
            for (int j=0;j<arr.length-turn-1;j++){
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
                if (swap==0)
                break;

            }
        }
    }
    public static void bubble_sort_descendingorder(int[] arr){
        for (int turn=0;turn< arr.length-1;turn++){
            for (int j=arr.length-turn-2;j>=0;j--){
                if (arr[j]< arr[j+1]){
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }
    public static void sorted_array(int[] arr){
        System.out.println();
        System.out.println("Sorted array is:");
        for (int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
    }
    public static void selection_sort(int[] arr){
        int n= arr.length;
        for (int i=0;i<n-1;i++){
            int minpos= i;
            for (int j=i+1;j<n;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            int temp= arr[minpos];
            arr[minpos]= arr[i];
            arr[i]= temp;
        }
    }
    public static void insertionSort(int[] arr){
        for (int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev= i-1;
            while (prev>=0 && arr[prev]> curr){
               arr[prev+1]= arr[prev];
               prev--;
            }
            arr[prev+1]= curr;
        }
    }

    public static void main(String[] args){
        int[] arr= {8,6,9,0,3,1,5,-9};
        //Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
        // bubble_sort_descendingorder(arr);
        insertionSort(arr);
         sorted_array(arr);
//        bubble_Sort(arr);
//        sorted_array(arr);

    }
}
