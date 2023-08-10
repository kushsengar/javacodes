import java.util.*;
public class sumofnatural {
    public static void main(String[] args)
    {
        int sum=0,n;
        System.out.println("enter n:");
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        for (int i=0;i<=n;i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
