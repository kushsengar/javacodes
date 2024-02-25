import java.util.Arrays;
import java.util.Scanner;

public class test {

public static int binary11_search(int[] nums, int target){
    int start=0; int end = pivot(nums)-1;int res=-1;
   for (int i=0;i<nums.length;i++){
       int mid= (start+end)/2;
       if (nums[mid]==target){
          res=mid;
          end= mid-1;

       }
       else if (nums[mid]<target) {
           start= mid+1;
       }
       else if(nums[mid]>target) {
           end= mid-1;
       }

   }
return res;
}
    public static int binary22_search(int[] nums, int target){
        int start=pivot(nums); int end = nums.length-1;int res=-1;
        for (int i=0;i<nums.length;i++){
            int mid= (start+end)/2;
            if (nums[mid]==target){
                res=mid;
                end= mid-1;

            }
            else if (nums[mid]<target) {
                start= mid+1;
            }
            else if(nums[mid]>target) {
                end= mid-1;
            }

        }
        return res;
    }
public static int pivot(int[] nums){
    int s=0;
    int e= nums.length-1;
    while(s<e){
       int mid = (s+e)/2;
       if(nums[mid]>=nums[0]){
           s= mid+1;
       }else {
           e= mid;
       }
       mid=(s+e)/2;
    }
    return s;
}
    public static int binary1_search(int[] nums, int target){
        int start=0;
        int end=pivot(nums)-1;
        for (int i=0;i<nums.length;i++){
            int mid=(start+ end)/2;
            if (nums[mid]==target){
                return mid;
            } else if (nums[mid]<target) {
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return -1;
    }
    public static int binary2_search(int[] nums, int target){
        int start=pivot(nums);
        int end=nums.length-1;
        for (int i=0;i<nums.length;i++){
            int mid=(start+ end)/2;
            if (nums[mid]==target){
                return mid;
            } else if (nums[mid]<target) {
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return -1;
    }
    public static int bin_search(int[] nums,int s, int e, int target){
        int start=s;
        int end=e;
        for (int i=0;i<nums.length;i++){
            int mid=(start+ end)/2;
            if (nums[mid]==target){
                return mid;
            } else if (nums[mid]<target) {
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
      int [] nums= {4,5,6,7,0,1,2};
//        int target= sc.nextInt();
        int p =pivot(nums);
        System.out.println(p);





    }
}
