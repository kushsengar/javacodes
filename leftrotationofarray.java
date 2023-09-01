import java.util.*;
public class leftrotationofarray {
public static void main(String[] args){
    int A[]={5,9,6,10,12,7,3,5,4,2};
    int temp= A[0];
    for(int x: A){
        System.out.print(x+",");
    }System.out.println();
    for(int i=0;i<A.length-1;i++){
        A[i]=A[i+1];
    } A[A.length-1]= temp;
    for (int x:A) {
        System.out.print(x+",");

    }

}
}
