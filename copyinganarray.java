import java.util.*;
public class copyinganarray {
    public static void main(String[] args){
        int A[]={5,9,6,10,12,7,3,4,14};
        int B[]= new int[9];
        for (int i=0;i<A.length;i++){
            B[i]= A[i];
        }
        for (int x: A
             ) {
            System.out.print(x+",");
        }
        System.out.println();
        for (int x:B
             ) {
            System.out.print(x+",");
        }
    }
}
