import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class binarySearchpractice {
    public static int firstOccur(int[] nums, int target){
        int s= 0; int e= nums.length-1;
        int mid= (s+e)/2;
        int ans=-1;   //for storing answer of binary search
        while(s<=e) {
            if (target == nums[mid]) {
                ans = mid;
                e = e - 1;
            } else if (target > nums[mid]) {
                s = mid + 1;
            } else if (target < nums[mid]) {
                e = mid - 1;
            }
            mid= (s+e)/2;
        }
       return ans;
    }
    public static int lastOccur(int[] nums, int target){
        int s= 0; int e= nums.length-1;
        int mid= (s+e)/2;
        int ans=-1;   //for storing answer of binary search
        while(s<=e) {
            if (target == nums[mid]) {
                ans = mid;
                s = mid+1;
            } else if (target > nums[mid]) {
                s = mid + 1;
            } else if (target < nums[mid]) {
                e = mid - 1;
            }
            mid= (s+e)/2;
        }
        return ans;
    }
    public static int Pivot(int[] nums){
        int s=0;
        int e=nums.length-1;
        while(s<e){
            int mid= (s+e)/2;
            if (nums[mid]>=nums[0]){
                mid=mid+1;
            }
            else {
                e=mid;
            }
            mid=(s+e)/2;
        }
     return s;
    }
    public static long sqrt_usingBS(int[] A,int N){
        long s=0;
        long e= N;
        long ans=-1;
        long mid= (s+e)/2;
        while(s<=e){

            long square = mid * mid;
           if (square==N){
             return mid;
           }
           if (square<N){
               ans = mid;
               s= mid+1;
           }
           else {
               e=mid-1;
           }
        }
       return ans;
    }
    public static int Single_element(int[] nums){
        int start=1;
        int end= nums.length-2;
        int n= nums.length;
        if(n==1){return nums[0];}
        if(nums[0]!=nums[1]){return nums[0];}
        if(nums[n-1]!=nums[n-2]){return nums[n-1];}
        while (start<=end){
            int mid= (start+end)/2;
            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]){
                return nums[mid];
            }
            if (mid%2==1 &&  nums[mid]==nums[mid-1] || mid %2 ==0 && nums[mid]== nums[mid+1]){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums= {1,1,2,2,3,3,4,4,5,6,6,7,7,8,8,99,99};
      //  System.out.println("left occ is :"+ firstOccur(nums,8));
      //  System.out.println("right occ is :"+ lastOccur(nums,8));
        //System.out.println("["+firstOccur(nums,8)+","+lastOccur(nums,8)+"]");
    //   int p= Pivot(nums);
       // System.out.println(p);
//        Scanner sc= new Scanner(System.in);
//        int N= sc.nextInt();
//        int[] A= new int[N];
//        for (int i=0;i<N;i++){
//            A[i]=i;
//        }
//        int ans = (int) sqrt_usingBS(A,N);
//        System.out.println(ans);
        System.out.println(Single_element(nums));
    }
}
