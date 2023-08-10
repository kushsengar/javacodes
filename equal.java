import java.util.*;
public class equal {
    public static void main(String[] args){
        int a, b;
        System.out.println("enter a:");
        System.out.println("enter b:");
        Scanner sc= new Scanner(System.in);
        a= sc.nextInt();
        b= sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        if (a == b)
        {
            System.out.println("a & b are equal");
        } else if (a>b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is less than b");
        }
    }
}
