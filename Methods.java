import java.util.Scanner;

public class Methods {
    public int Factorial(int n){
        int f=1;
       for (int i=1;i<=n;i++){
           f=f*i;
       }
        return f;
    }
    public int BonCoeff(int n,int r){
        int Fact_r= Factorial(r);
        int Fact_n= Factorial(n);
        int Fact_nmr= Factorial(n-r);
        return (Fact_n)/(Fact_nmr*Fact_r);
    }

    public static void main(String[] args){
       Methods m= new Methods();
        System.out.println(m.Factorial(5));
        System.out.println(m.BonCoeff(5,1));
    }
}
