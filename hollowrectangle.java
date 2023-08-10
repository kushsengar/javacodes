public class hollowrectangle {
    public static void main(String[] args){
        int i,j;
        int n=4,m=5;
        for(i=1;i<=n;i++)
        {
            for (j=1;j<=m;j++) {
                if (j == 1 || j == m || i == 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            }
        }
}
