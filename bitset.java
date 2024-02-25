import java.util.*;
public class bitset {
    public static void main(String[] args){
      BitSet bs1 = new BitSet();
      bs1.set(1,5);
      BitSet bs2 = new BitSet();
      bs2.set(0,4);
      bs1.and(bs2);
        System.out.println(bs2);
       }
}
