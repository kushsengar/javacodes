import java.util.*;
public class swapping {
    public static void main(String[] args) {
        int a,b;
        System.out.println("enter a & b:");
        Scanner sc= new Scanner(System.in);
        a= sc.nextInt();
        b=sc.nextInt();
        System.out.println("value of a before swap:"+ a);
        System.out.println("value of b before swap:"+ b);
        // now usage of bitwise operator XOR "^"

        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("value of a after swap:"+a);
        System.out.println("value of b after swap:"+b);

    }
}