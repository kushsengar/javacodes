public class solidrhombus {
    public  static  void main(String[] args) {
        int n = 5,m=9;
        int cell = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (j>cell){
                System.out.print("*");}
                else {
                    System.out.print(" ");
                }
            }m=m-1;
             cell=cell-1;
            System.out.println();
        }
        }
}



