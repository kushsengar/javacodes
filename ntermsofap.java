import java.util.*;
public class ntermsofap {
    public static void main(String[] args){

        // program to print n terms of A.P
        int n;
        int a,d;
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        a= sc.nextInt();
        d = sc.nextInt();
        for (int i=1; i<=n;i++){
            int an= (int) (a+ (i-1)*d);
            System.out.print(an+" ");
        }
    }
}
