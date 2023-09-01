import java.util.*;
public class elementinsertion {
    public static void main(String[] args){
        int A[]= new int[10];
        A[0]=5;
        A[1]=9;
        A[2]=6;
        A[3]=10;
        A[4]=12;
        A[5]=7;
        for (int i=5;i>=2;i--){
            A[i+1]=A[i];
        } A[2]=15;
        for (int x:A) {
            System.out.print(x+",");
        }
    }
}
