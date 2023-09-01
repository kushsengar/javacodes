import java.util.*;
public class sumofelements {
    public static void main(String[] args)
    {
    int A[] = {3,9,9,5,7,5,2,1,4};
    int sum=0;
//    for (int i=0;i<A.length;i++){
//        sum= sum+ A[i];
//    }
//        System.out.println(sum);
  for( int x:A){
      sum= sum+x;
  }
        System.out.println(sum);


    }
}