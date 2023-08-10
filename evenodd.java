import java.util.*;
public class evenodd {
    public static void main(String[] args)
    {
        int num;
        System.out.println("enter any number:");
        Scanner sc= new Scanner(System.in);
        num= sc.nextInt();
        if (num%2==0)
        {
            System.out.println("num is even");
        }else {
            System.out.println("num is odd");}

    }
}
