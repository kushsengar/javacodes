import java.util.*;
public class ArraysandComparator {
    public static void main(String[] args)
    {

        int a[] = {8,9,7,3,4,1,0,2};
        int b[] = {1,2,3,4,5,6,7};

             int c[]= Arrays.copyOf(a,a.length);
             Arrays.sort(c);
        for (int x:c)
            System.out.println(x);

        System.out.println();

        System.out.println(Arrays.binarySearch(c,9));
      /*  Arrays.fill(c,5);

        for(int x:c)
            System.out.println(x);*/




             // System.out.println(Arrays.compare(a,b));


    }
}
