import java.util.*;
public class keysearch {
    public static void main(String[] args){
        int key;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter any key :");
        key= sc.nextInt();
        int A[]={1,2,3,4,5,6,7,8,9,10,11,15,19,25,58};
        for (int i=0; i<A.length;i++){
            if (A[i]==key){
                System.out.println(i);
                System.exit(0);
            }
        }
        System.out.println("invalid key");

    }
}
