import java.util.*;
import java.lang.*;
public class radixofnum {
    public static void main(String[] args){
        String str;
        Scanner sc= new Scanner(System.in);
        str = sc.next();
        if (str.matches("[0-1]+")){
            System.out.println("radix is 2");
        }
        else if (str.matches("[0-7]+")) {
            System.out.println("radix is 8");

        } else if (str.matches("[0-9]+")) {
            System.out.println("radix is 10");
        } else if (str.matches("[0-9A-F]+")) {
            System.out.println("radix is 16");
        }
        else {
            System.out.println("not a number");
        }
    }
    }

