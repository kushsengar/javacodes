import java.lang.*;
import java.util.*;
public class areaofatriangle {
    public static void main(String[] args)
    {
        int a ,b ,c;
        float s, area;
        System.out.println("enter a,b& c");
        Scanner sc= new Scanner(System.in);
        a= sc.nextInt();
        b= sc.nextInt();
        c=sc.nextInt();
        s=(a+b+c)/2f;
        area= (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("area of triangle is"+ area );
    }
}
