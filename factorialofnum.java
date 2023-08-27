import java.util.*;
public class factorialofnum {
    public static void main(String[] args){
        int num,fact=1;
        Scanner sc= new Scanner(System.in);
        num = sc.nextInt();
        for (int i =num;i >=1;i--){
            fact=i*fact;
        }
        System.out.println(fact);
    }
}
