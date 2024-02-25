import java.awt.*;

class Pattern {
    public void StarPattern() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }

    }
    public void InvertedStarPattern(){
        for (int i = 4; i >=1 ; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }

    }
    public void HalfPyramid(){
        int n=4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }

    }

    public void CharacterPyramid(){
        int line =4;
        char ch = 'A';
        for (int i=1;i<=line;i++){
            for(int j= 1;j<=i;j++){

                System.out.print(ch);
                ch= (char) (ch+1);
            }
            System.out.println();
        }

    }
    public static void StarPattern2(){
        for(int i=1;i<=4;i++){
            for (int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();












        }


    }

}public class patterns {
    public static void main(String[] args){
        Pattern p = new Pattern();
     //   p.StarPattern();
//       p.InvertedStarPattern();
         // p.HalfPyramid();
       // p.CharacterPyramid();

        Pattern.StarPattern2();
    }
}
