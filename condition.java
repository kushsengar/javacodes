import java.util.*;
public class condition {
    public static void main(String[] args) {
        int age;
        System.out.println("enter your age:");
        Scanner sc= new Scanner(System.in);
        age= sc.nextInt();
        if (age>18)
        {
            System.out.println("you are adult already!!");
        }
        else {
            System.out.println("not an adult!! groww up!!");
        }
    }

}