import java.util.*;
public class elementdeletion {
    public static void main(String[] args){
        int A[]= new int[6];
        A[0]=5;
        A[1]=2;
        A[2]=10;
        A[3]=18;
        A[4]=24;
        A[5]=101;
        for (int i=1;i<5;i++){
            A[i]= A[i+1];
        }
        for (int x:A
             ) {
            System.out.print(x+",");
        }
    }
}
