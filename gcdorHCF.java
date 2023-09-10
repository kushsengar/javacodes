import java.util.*;
public class gcdorHCF {
    static int gcd(int m, int n) {
        while (m != n) {
            if (m > n) m = m - n;
            else n = n - m;
        }
        return m;
    }
    public static void main(String[] args){
        int m,n;
        Scanner sc = new Scanner(System.in);
        m= sc.nextInt();
        n = sc.nextInt();
     int  c= gcd(m,n);
        System.out.println(c);

    }
}
