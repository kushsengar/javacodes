import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Hashmap{
public void Hashmap(){
    HashMap<Integer, String> tm = new HashMap<>(Map.of(1,"A",2,"B",3,"C",4,"D"));
    tm.put(5,"E");
  //  Map.Entry<Integer, String> e= tm.ceilingEntry(6);
 //   System.out.println(e);
    System.out.println(tm);
}

}
public class Treemap {
    public void Treemap(){
        TreeMap<Integer, String> tm = new TreeMap<>(Map.of(1,"A",2,"B",3,"C",4,"D"));
        tm.put(5,"E");
        Map.Entry<Integer, String> e= tm.ceilingEntry(6);
        System.out.println(e);
        System.out.println(tm);
    }
    public static void main(String[] args){
            Treemap tm = new Treemap();
            tm.Treemap();
            Hashmap hm = new Hashmap();
            hm.Hashmap();
            hm.toString();

    }
}
