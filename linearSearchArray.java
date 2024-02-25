import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class linearSearchArray {
    public static int index(int number[],int key){
        for (int i=0;i<number.length;i++){
            if (number[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static int largest_In_Array(int[] Array){
        int largest= Array[0];
        for (int i=0;i<Array.length;i++){
            if (Array[i]>largest){
                largest=Array[i];
            }
        }
        return largest;
    }
    public static int binary_search(int[] number, int key){
        int start=0;
        int end=number.length-1;
        for (int i=0;i<number.length;i++){
            int mid=(start+ end)/2;
            if (number[mid]==key){
                return mid;
            } else if (number[mid]<key) {
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return -1;
    }
    public static void reversed_Array(int[] number){
        int first=0;int last= number.length-1;
        while (first<last) {
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;
            first++;
            last--;
        }
    }
    public static void pairs_In_Array(int[] number){
        int tp=0;
for (int i=0;i<number.length;i++){
    int curr= number[i];
    for (int j=i+1;j<number.length;j++){
        System.out.print("("+ curr+ "," + number[j]+ ") ");
        tp++;
    }
    System.out.println();
}
        System.out.println(tp);
    }
    public static void MaxsumOf_subsets_of_Array(int number[]){
        int currSum=0;
        int maxSum= Integer.MIN_VALUE;
        for (int i=0;i<number.length;i++){
            int start=i;
            for (int j=i;j<number.length;j++){
             int end= j;
                 currSum=0;
                for (int k=start;k<=end;k++){

                   // System.out.print(number[k]+" ");
                  currSum = currSum + number[k];
                }
                if (maxSum<currSum){
                    maxSum=currSum;
                }
                System.out.print("sum ="+currSum);
                System.out.println();

            }
            System.out.println();
            System.out.println("maximum sum is "+maxSum);
            //System.out.println("total subarrays:"+ ts);

        }
    }
public static void maxsum_subsetofArray_byPrefixArray(int [] number){
        int[] prefix= new int[number.length];
        prefix[0]= number[0];
        for (int i=1;i<prefix.length;i++ ){
            prefix[i]=prefix[i-1]+number[i];
        }
    int currSum=0;
    int maxSum= Integer.MIN_VALUE;
    for (int i=0;i<number.length;i++){
        int start=i;
        for (int j=i;j<number.length;j++){
            int end= j;
            currSum= start==0?prefix[end]: prefix[end]-prefix[start-1];
            if (maxSum<currSum){
                maxSum=currSum;
            }
           // System.out.print("sum ="+currSum);
           // System.out.println();

        }
        //System.out.println();

        //System.out.println("total subarrays:"+ ts);

    }
    System.out.println("maximum sum is "+maxSum);

}
public static void kadanes(int[] num){
        int cs=0;
        int ms= num[0];
        for (int i=0;i<num.length;i++){
            cs= cs+ num[i];
            ms=Math.max(cs,ms);
            if(cs<0){
                cs=0;
            }

        }

    System.out.println("maximum subarray sum is "+ ms);
}
    public static void main(String [] args){
        int[] number = {5,4,-8,2,3,-9};
        int[] num={-2,-3};
       // int key=10;
//        int index= index(number,key);
//        if (index==-1){
//            System.out.println("Not found");
//        }else {
//            System.out.println("key found at index "+ index);
//        }
//        int[] Array = {1,2,6,3,5};
//        int greatest= largest_In_Array(Array);
//        System.out.println(greatest);
//        int[] number={2,4,6,8,10,12,14};
//        int key=10;
//
//        int index= binary_search(number,key);
//        if (index==-1){
//            System.out.println("key NOT found");
//        }else {
//            System.out.println("key is found at index "+index);
//        }
//reversed_Array(number);
//for (int i=0;i<number.length;i++){
//    System.out.print(number[i]+" ");
//}
       // pairs_In_Array(number);
       //MaxsumOf_subsets_of_Array(number);
//maxsum_subsetofArray_byPrefixArray(number);
            // kadanes(num);
        binary_search(number,-8);
    }
}
