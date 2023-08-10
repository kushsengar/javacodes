import java.util.*;
public class evennumbers {
    public static void main(String [] args){
        int i,n;
        System.out.println("enter n:");
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        for(i=0;i<=n;i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
