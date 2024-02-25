import java.util.Scanner;

public class isPrime {
   /* public static boolean isPrime(int n){
        boolean isPrime= true;
        if (n==1 || n==2){
            return true;
        }
        for (int i=2;i<=n-1;i++){
            if (n%i==0){
                isPrime= false;
                break;
            }
        }
        return isPrime;
    }*/
    public static boolean isPrime(int n){
        if (n==2){
            return true;
        }
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){return false;}
        }
        return true;
    }
    public static void PrimeInRange(int n){
        for (int i=2;i<=n;i++){
            if (isPrime(i)==true){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isPalindrome(int n){
        int r,sum=0,temp;//It is the number variable to be checked for palindrome
        temp=n;
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            //System.out.println("palindrome number ");
            return true;
        else
            //System.out.println("not palindrome");
            return false;
    }
    public static void PrimePalindromeinRange(int R){



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int R = sc.nextInt();
        if (isPrime(n)==true && isPalindrome(n)==true){
            System.out.println(n + "is both");
        }else {
            System.out.println("not both");
        }
    }
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

   {
        int N= sc.nextInt();
        if(N==1){System.out.print("0"+" "+"1");}
        else {
            if (N == 4) {
                System.out.print("0" + " " + "4");
            } else {
                System.out.print("1" + " " + "7");
            }
        }
    }
}