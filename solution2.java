import java.util.*;
import java.io.*;
import java.math.*;
public class solution2 {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();

        for(int i =0;i<n;i++)
        {
            a = a + ((int)Math.pow(2,i) * b);

            System.out.print(a + " ");
        }
        System.out.print("\n");
    }


    }


