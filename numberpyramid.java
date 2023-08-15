public class numberpyramid{
    public  static  void main(String[] args) {
        int n = 5;
        int cell = 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                if (j>cell){
                    System.out.print(i);}
                else {
                    System.out.print(" ");
                }
            }
            cell=cell-1;
            System.out.println();
        }
    }
}



