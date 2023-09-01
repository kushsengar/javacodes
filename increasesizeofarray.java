import java.util.*;
public class increasesizeofarray {
public static void main(String[] args){
    int A[]={5,9,6,10,12};
    System.out.println(A.length);
    int B[]= new int[2*A.length];
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
    System.out.println();
           A= B;
           B= null;
    System.out.println(A.length);

}
}
