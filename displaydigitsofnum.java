import java.util.*;
public class displaydigitsofnum {
    public static void main(String[] args){
        int counter = 0,num,digit;
        Scanner sc= new Scanner(System.in);
        num= sc.nextInt();
        while(num>0){
  //          digit=num%10;
            num=num/10;
//            System.out.println(digit);
           counter= counter+1;
        } System.out.println(counter);
        }
//        System.out.println(num);
//
   //         o=num%10;
     //       t=(num/10)%10;
       //     h=num/100;
//        System.out.println(o);
//        System.out.println(t);
//        System.out.println(h);
        }


