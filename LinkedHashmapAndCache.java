import java.util.*;
public class LinkedHashmapAndCache {
    public static void main(String[] args){
        LinkedHashMap<Integer, String> lhm= new LinkedHashMap<>(5,.75f,true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                return size()>5;
            }
        };
        lhm.put(1,"kush");
        lhm.put(2,"khushi");
        lhm.put(3,"loves");
        lhm.put(4,"each");
        lhm.put(5,"other");

        String s= lhm.get(5);
        s= lhm.get(2);
        lhm.put(6,"kiss on lips");

        lhm.forEach((k,v)-> System.out.println((k+" "+v)));
    }
}
