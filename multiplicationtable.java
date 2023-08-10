import java.util.*;
public class multiplicationtable {
    public static void main(String[] args){
        int i,n,t;
        System.out.println("enter n:");
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        for (i=1;i<=10;i++)
        {
            t=n*i;
            System.out.println(n*i);
        }
    }
}
