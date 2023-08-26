import java.lang.String;

import java.util.*;
public class typeofwebsiteusingswitchcase {
    public static void main(String[] args){
        String str;
        Scanner sc = new Scanner(System.in);
        str= sc.nextLine();
        String ext = str.substring(str.lastIndexOf(".")+1);
        switch (ext){
            case "com" :
                System.out.println("commercial website");
                break;
            case "org" :
                System.out.println("organisational website");
                break;
            case "net":
                System.out.println("network website");
                break;
            case "gov":
                System.out.println("government website");
                break;
            default:
                System.out.println("error 303");
        }
    }
}
