import javax.xml.stream.XMLEventWriter;
import java.security.cert.CertPathValidatorException;
import java.util.Scanner;

class rectangle{
    public double length;
    public double breadth;

    public double area(){ return length* breadth;}

    public double perimeter(){ return 2*(length+breadth);}

    public boolean issquare(){
        return length== breadth;
    }


}
public class myjava2 {
    public static void main(String[] args){
        rectangle r1= new rectangle();
        rectangle r2 = new rectangle();
        System.out.println("enter the dimensions:");
        Scanner sc= new Scanner(System.in);

        r1.length = sc.nextDouble();
        r1.breadth= sc.nextDouble();
        r2.length= sc.nextDouble();
        r2.breadth= sc.nextDouble();
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
        System.out.println(r2.area());
        System.out.println(r2.perimeter());
        System.out.println(r1.issquare());
        System.out.println(r2.issquare());
    }

}
