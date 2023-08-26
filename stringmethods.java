import java.lang.*;
import java.util.*;
public class stringmethods {
    public static void main(String[] args) {

        // testing all string methods

        //length test

        String str1 = "java";
        int l = str1.length();
        System.out.println(l);

        //conversion of string to uppercase

        String str2 = str1.toUpperCase();
        System.out.println(str2);

        // trimming of string

        String str3 = "   welcome   ";
        str3 = str3.trim();
        System.out.println(str3);

        // part of string

        String str_4 = str3.substring(3);
        System.out.println(str_4);

        String str_5 = str3.substring(1, 6);
        System.out.println(str_5);

        //replace alphabets

        String str_6 = str3.replace('c', 'k');
        System.out.println(str_6);

        // check the string for particular words

        String str7 = "java the complete reference";
        System.out.println(str7.startsWith("java"));
        System.out.println(str7.startsWith("kush"));
        System.out.println(str7.endsWith("complete"));
        System.out.println(str7.endsWith("reference"));

        // testing for character at any index by taking index as user input
     /*   int n;
        System.out.println("enter the index n:");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
      //  char c;
        //    for (int i = 0; i <= n; i++) {
           //      c = str7.charAt(n);
           //     System.out.println(c);

            }*/

        // testing index of any element in the given string

        System.out.println(str7.indexOf("c")); //here also we can apply for loop similary as above.
        {
            String str8 = "java";
            String str9 = "java";
            String str10 = "python";
            String str11 = "PYTHON";

            // now we will compare the above 4 strings str8, str9, str10, str11 respectively.

            System.out.println(str8.equals(str9));
            System.out.println(str8.equals(str10));
            System.out.println(str10.equals(str11));
            System.out.println(str10.equalsIgnoreCase(str11));
            System.out.println(str8.compareTo(str10));
        }
    }
    // testing of regular expressions
}