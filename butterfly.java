public class butterfly {
    public static void main(String[] args){
        int n=5;
        for (int i=1 ; i<=n; i++){
            //upper half
            for (int j=1; j<=i;j++){
                System.out.print("*");
            }
            //spaces
            int spaces= 2*(n-i);
            for (int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //upper half
            for (int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }        for (int i=n ; i>=1; i--){
            //lower half
            for (int j=1; j<=i;j++){
                System.out.print("*");
            }
            //spaces
            int spaces= 2*(n-i);
            for (int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //lower half
            for (int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
