import java.util.Scanner;

public class IsMulOfTen {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N;
        do {
            System.out.println("Enter any number : ");
            N= sc.nextInt();
            if (N%10==0){
                continue;
            }
            System.out.println(N);
        }while(true);  // without break statement while(N%10!=0);  // without break statement
    }
}
