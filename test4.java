import java.util.Arrays;

public class test4 {
    public static int[] product_array(int[] nums){
        int right_product=1;
        int n= nums.length;
        int[] answer= new int[n];
        for (int i=0;i<n;i++){
            if (i==0){
                answer[i]=nums[i];
            }else {
                answer[i]= answer[i-1]* nums[i];
            }
        }
        for (int i=n-1;i>=0;i--){

            if (i==n-1){
                answer[i]=answer[i-1];
                right_product= right_product* nums[i];
            }
            else if(i==0) {
                answer[i]= right_product;
            }
            else {
                answer[i]= answer[i-1]* right_product;
                right_product= right_product* nums[i];
            }
        }
        return answer;
    }

        public static int[] productExceptSelf(int[] nums) {
            int n=nums.length;
            int []prefix=new  int[n];
            int []suffix=new  int[n];
            prefix[0]=1;
            for(int i=1;i<n;i++)
            {
                prefix[i]=nums[i-1]*prefix[i-1];
            }
            suffix[n-1]=1;
            for(int i=n-2;i>=0;i--)
            {
                suffix[i]=nums[i+1]*suffix[i+1];
            }
            int []ans=new  int[n];
            for(int i=0;i<n;i++)
            {
                ans[i]=prefix[i]*suffix[i];
            }
            return ans;
        }
        public static void swap(int ma,int mi){
        int temp= ma;
        ma= mi;
        mi= temp;
        }
        public static int max_product_subArray(int[] nums){
        int ans= nums[0];
        int ma= ans;
        int mi= ans;
        int n= nums.length;
        for (int i=1;i<n;i++){
            if (nums[i]<0){
                swap(ma,mi);
            }
            ma= Math.max(nums[i], ma* nums[i]);
            mi= Math.min(nums[i],mi* nums[i]);
            ans= Math.max(ans,ma);
        }
        return ans;
        }
        public static int fibonacci(int n) {
        int prev=0;
        int next=1;
        int sum=prev+ next;
        for (int i=2;i<=n;i++){
            next   = (i-1)+ (i-2);
        sum +=next;
        }
        return sum;
    }
    public String firstPalindrome(String[] words) {

        for(int i=0;i<words.length;i++){
            StringBuilder sb = new StringBuilder(words[i]);
            String str= sb.reverse().toString();
            if(str.equals(words[i]) )
            {
                return words[i];
                //  break;
            }
        }
        return "";

    }
    public static void main(String[] args){
        int[] nums={1,-10,-3,-4};
        String[] words= {"abc","car","ada","racecar","cool"};
      //  product_array(nums);
//        System.out.println(Arrays.toString(product_array(nums)));
//        System.out.println(Arrays.toString(productExceptSelf(nums)));
        //System.out.println(max_product_subArray(nums));
       // System.out.println(fibonacci(4));

    }
}
