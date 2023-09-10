import java.util.*;
public class overloadedarea {

    // area of rectangle
    static double area(double l, double b){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter length & breadth");
         l = sc.nextDouble();
         b= sc.nextDouble();
         double area = l * b;
        return area;
    }

        static double area(double radius){
          Scanner sc = new Scanner(System.in);
            System.out.println("enter radius:");
            radius = sc.nextDouble();
            double area= Math.PI*radius* radius;
            return area;

        }

    public static void main(String[] args){
       double p = area(5);
        System.out.println(p);

    }
}
