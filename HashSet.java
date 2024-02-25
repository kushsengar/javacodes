import java.util.List;
import java.util.TreeSet;

public class HashSet {
    public void HashSet(){
        java.util.HashSet<Character> hs= new java.util.HashSet<>();
        hs.add('K');
        hs.add('U');
        hs.add('S');
        hs.add('H');
        java.util.HashSet<Character> hs2= new java.util.HashSet<>(List.of('K','H','U','S','H','I'));
        hs.addAll(hs2);
        System.out.println(hs);
    }
    public void TreeSet(){
        TreeSet<Integer> ts = new TreeSet<>(List.of(10,20,30,50,75));
      //  ts.headSet(15);
        System.out.println(ts.ceiling(30));
        System.out.println(ts.floor(80));
        System.out.println(ts);
        System.out.println(ts.contains(35));

    }
    public static void main(String[] args){
        HashSet hs = new HashSet();
        hs.HashSet();
        hs.TreeSet();

    }
}
