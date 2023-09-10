import java.util.*;
public class primenomethod {
    static boolean prime(int x) {
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }
        public static void main(String[]args){
            int n;
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            System.out.println(prime(n));
        }
    }


