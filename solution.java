import java.util.Scanner;

    public class solution {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("================================");
            for (int i = 0; i < 3; i++) {
                String s1 = sc.next();
                int x = sc.nextInt();
                System.out.print(s1);
                if (x < 100) {
                    System.out.print("        0" + x);
                } else {
                    System.out.print("        "+x);
                }
            }
            System.out.println();
            System.out.println("================================");
        }

    }






