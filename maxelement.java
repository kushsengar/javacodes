import java.util.*;
public class maxelement {
    public static void main(String[] args){
        int A[]={4,9,15,8,3,19,50,12,14,21,24,28};
        int max= A[0];
        for (int i=0;i<A.length;i++){
            if (A[i]>max){
                max= A[i];
            }
        }
        System.out.println(max);
    }
}
