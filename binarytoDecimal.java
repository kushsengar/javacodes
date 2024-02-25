import java.util.Scanner;

public class binarytoDecimal {

    public static boolean isEven(int N){
        if(N%2==0){
            return true;
        }else {return  false;}
    }
    public static void binToDec(int biNum){
       int myNum=biNum;
        int dec=0;
        int pow=0;
        while (biNum>0){
            int ld= biNum%10;
            dec= dec+ (int)(ld* Math.pow(2,pow));
            biNum=biNum/10;
            pow++;
        }
        System.out.println(dec);
    }
    public static void isPalindrome(int N){
        int num1=0;
        int num=N;
        while(N!=0){
            num1= num1*10+ N%10;
            N=N/10;
        }
        if (num==num1){
            System.out.println("yes "+num+" is Palnidrome");
        }else {
            System.out.println(num+" is not Palindrome");
        }
    }
    public static void sumOfDigits(int N){
        int num1=0;
        while(N!=0){
            num1=num1+N%10;
            N/=10;
        }
        System.out.println(num1);
    }
    public static void main(String[] args){
       ///// Scanner sc= new Scanner(System.in);
        ///int biNum= sc.nextInt();
       // System.out.println(isEven(55));
        isPalindrome(155);
        System.out.println(Math.max(55,155));
        System.out.println(Math.min(12.05,12.049));
        System.out.println(Math.sqrt(25));
        System.out.println(Math.abs(-156.6));
       // System.out.println(Math.average);
        sumOfDigits(147);
    }
}
