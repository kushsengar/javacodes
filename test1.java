class test3{
    int min;
    int max;
    public test3(int mn,int mx){
        min=mn;
        max=mx;
    }
}
public class test1 {
    public static void reverse_Array(int[] Arr){
        int[] B= new int[Arr.length];
        for (int i=0;i<Arr.length;i++){
            B[i]=Arr[4-i];
        }
        for (int i=0;i<Arr.length;i++){
            System.out.print(B[i]+" ");
        }
    }
    public static test3 min_and_maxofarray(int[] Arr){
        int max= Arr[0];
        int min= Arr[0];
        int[] A= new int [2];
        for (int i=0;i<Arr.length;i++){
            if (Arr[i]<min){
                min= Arr[i];
                A[0]=min;
            }if (Arr[i]>max){
                max= Arr[i];
                A[1]=max;
            }
        }
        return new test3(min,max);
    }
    public static void reverse_Array_byswap(int[] Arr){
        for (int i=0;i<Arr.length/2;i++){
            int temp = Arr[i];
            Arr[i]= Arr[Arr.length-i-1];
            Arr[Arr.length-i-1]=temp;
        }
        for (int i=0;i<Arr.length;i++){
            System.out.print(Arr[i]);
        }
        System.out.println();
        System.out.println();
    }

       public static boolean isPossible(int[] Arr, int n, int m, int mid){
            int studentCount=1;
            int pageSum=0;
            for(int i=0;i<n;i++){
                if(pageSum+Arr[i]<=mid){
                    pageSum+= Arr[i];
                }else
                    studentCount++;
                if(studentCount > m || Arr[i]>mid){
                    return false;
                }
                pageSum = Arr[i];
            }
            return true;
        }

        public static int findPages(int[] Arr, int n, int m) {
            // Write your code here.
            int s=0;
            int sum=0;
            for(int i=0;i<n;i++){
                sum+= Arr[i];
            }
            int e= sum;
            int mid= (s+e)/2;
            int ans=-1;
            while(s<=e){
                if(isPossible(Arr,n,m,mid)){
                    ans=mid;
                    e= mid-1;
                }
                else
                {
                    s=mid+1;
                }
            }
            return ans;
        }
    public static void main(String [] args){
        int[] Arr={10,20,30,40,50,60};
       // reverse_Array(Arr);
       // int[] A= min_and_maxofarray(Arr);
       // System.out.println("min="+A[0]);
       // System.out.println("max="+A[1]);
//        test3 t3= min_and_maxofarray(Arr);
//        System.out.println("max="+t3.max);
//        System.out.println("min="+t3.min);
        //reverse_Array_byswap(Arr);
//        for (int i=0;i<Arr.length;i++){
//            System.out.print(Arr[i]);
//        }
        int x=findPages(Arr,2,2);
        System.out.println(x);
    }
}
