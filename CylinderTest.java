import java.util.Scanner;

class Cylinder{
    public double radius;
    public double height;
    public double LidArea(){
        return Math.PI*radius*radius;
    }
    public double TotalArea(){
        return LidArea() + 2*Math.PI*radius*radius;
    }
    public double Volume(){
        return Math.PI*radius*radius*height;
    }
}
public class CylinderTest {
    public static void main(String[] args){
        Cylinder c1= new Cylinder();
        System.out.println("enter dimensions:");
        Scanner sc = new Scanner(System.in);
        c1.radius= sc.nextDouble();
        c1.height= sc.nextDouble();;
        System.out.println("lid area is "+c1.LidArea());
        System.out.println("total area is "+ c1.TotalArea());
        System.out.println("volume is "+ c1.Volume());
    }
}
