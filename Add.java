import java.util.Scanner;

public class Add {
    public static void main(String[] args){
        int num1 , num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num1");
        num1= sc.nextInt();
        System.out.println("enter num2");
        num2= sc.nextInt();
        sum= num1+num2;
        System.out.println(sum);
    }
}
