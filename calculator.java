import java.util.*;
public class calculator {
    public static void main(String[] args)
    {
        int a , b, c,operation;
        System.out.println("operation");
        System.out.println("enter a :");
        System.out.println("enter b:");
        Scanner sc= new Scanner(System.in);
        operation=sc.nextInt();
        a = sc.nextInt();
        b= sc.nextInt();
        switch(operation){
            case 1: c= a+b;
                System.out.println(c);
                break;
            case 2:c= a-b;
                System.out.println(c);
                break;
            case 3:c= a*b;
                System.out.println(c);
                break;
            case 4: c=a/b;
                System.out.println(c);
                break;
            case 5: c=a%b;
                System.out.println(c);
            default:
                System.out.println("invalid operations");

        }
    }
}
