import java.util.*;
public class hellonamastebonjour {
    public static void main(String[] args){
        int button;
        System.out.println("press any numeric key");
        Scanner sc= new Scanner(System.in);
        button= sc.nextInt();
        switch (button){
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("namaste");
                break;
            case 3:
                System.out.println("bonjour");
                break;
            default:
                System.out.println("invalid keys pressed");
        }

    }
}
