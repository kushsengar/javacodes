import java.util.*;
public class secondlargest {
public static void main(String[] args){
    int A[]= {14,8,6,9,15,12,52,16,19,28,4,5,1};
    int max1=A[0];
    int max2= A[0];
    for (int i=0;i<A.length;i++){
        if (A[i]>max1){
            max2= max1;
            max1= A[i];
        }else if (A[i]> max2){
            max2= A[i];
        }
    }
    System.out.println(max1);
    System.out.println(max2);
}
}


