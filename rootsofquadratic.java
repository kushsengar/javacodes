import java.util.*;
import java.lang.*;
public class rootsofquadratic {
    public static void main(String[] args){
        int a,b,c;
        double r1, r2, D;
        System.out.println(" enter a ,b ,c:");
        Scanner sc= new Scanner(System.in);
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        D= (double) Math.sqrt(b*b-4*a*c);
        if (D>0){
        r1= (-b+D)/2*a;
        r2= (-b-D)/2*a;
            System.out.println("root 1:"+r1);
            System.out.println("root 2:"+r2);
    } else if (D==0) { r1= -b/2*a;
            r2=-b/2*a;
            System.out.println("root1:"+r1);
            System.out.println("root2:"+r2);
        }
        else {
            System.out.println("real roots doesn't exist");
        }
    }
}
