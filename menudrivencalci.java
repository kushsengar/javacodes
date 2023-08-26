import java.lang.*;
import java.util.*;
public class menudrivencalci {
    public static void main(String[] args) {
        int a, b;
        System.out.println("enter the numbers:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("enter the operation in words:");
        String op;
        op = sc.nextLine();
        op = sc.nextLine();
        System.out.println(op);


//        String str1= "ADD";
//        String op1=op.matches();

        switch (op) {
            case "ADD":
                System.out.println(a + b);
                break;
            case "SUB":
                System.out.println(a - b);
                break;
            case "MUL":
                System.out.println(a * b);
                break;
            case "DIV":
                System.out.println(a / b);
                break;
            default:
                System.out.println("you are gorgeous");
        }
    }
}