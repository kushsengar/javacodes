import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String [] args) {
//        int N;
//        System.out.println("enter value of N: ");
//        Scanner sc = new Scanner(System.in);
//        N = sc.nextInt();
//        for (int i=2;i<=N-1;i++){
//            if (N%i!=0){
//                System.out.println(N+"is prime");
//            }
//           else{
//                System.out.println(N+"is not prime");
//            }
//
//        }
        // EASY WAY
//        int n= 10899;
//        while(n>0){
//            int ld = n%10;
//            System.out.print(ld);
//            n=n/10;
//        }
        //  System.out.println();

        // REVERSE OF A NUMBER
//        System.out.println("Another Method");
//        Scanner sc = new Scanner(System.in) ;
//        int n = sc.nextInt();
//        int rev=0;
//        while( n>0){
//            int ld = n%10;
//            rev = (rev * 10) + ld;
//
//            n= n/10;
//        }
//        System.out.print(rev);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numner N : ");
        int N = sc.nextInt();


        boolean IsPrime = false;
        if (N == 2) {
            System.out.println(N + " is prime");
        } else {
            IsPrime = true;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0)
                    IsPrime = false;

            }
        }
        if (IsPrime == true) {
            System.out.println(N + " is prime");
        } else {
            System.out.println(N + " is not prime");
        }

    }
}
