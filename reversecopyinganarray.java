import java.util.*;
public class reversecopyinganarray {
    public static void main(String[] args){
        int A[]={5,9,6,10,12,7,3,4,14};
        int B[]= new int[9];
        for (int i=A.length-1,j=0;i>=0;i++,j++){
            B[j]= A[i];
        }
        for (int x:A
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
