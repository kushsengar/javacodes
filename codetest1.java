import java.util.Scanner;

public class codetest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0){
            int mS = 0;
            int index = 0;
            for(int i=0 ; i<22 ; i++){
                int r = sc.nextInt();
                int w = sc.nextInt();
                if(r+w*20 > mS) {
                    mS = r + w * 20;
                    index = i+1;
                }
            }
            System.out.println(index);

        }
}}