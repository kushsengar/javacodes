public class nextPermutation {
    public static void reversed_Array(int[] nums , int i , int j){
        int first=i;int last=j;
        while (first<last) {
            int temp = nums[last];
            nums[last] = nums[first];
            nums[first] = temp;
            first++;
            last--;
        }
    }
    public static int[] nextPermutation(int[] nums){
        int index=-1;
        int n= nums.length;
        for (int i=n-2;i >=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if (index==-1){
            reversed_Array(nums,0,n-1);
            return nums;
        }
        for (int i= n-2;i>=index;i--){
            if (nums[i]>nums[index]){
                //swap(nums[i],nums[index]);
                int temp= nums[i];
                nums[i]= nums[index];
                nums[index]= temp;

                break;
            }
        }
        reversed_Array(nums, index+1,n-1);
        return nums;
    }
    public static void main(String[] args){
        int[] nums= {3,2,1};
        nextPermutation(nums);
        for (int i=0;i< nums.length;i++){
            System.out.print(nums[i]);
        }
    }
}
