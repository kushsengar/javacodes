import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.*;


 class Properties{
     String prop, value;

     protected String Property(String prop,String value)
     {
    this.prop= prop;
    this.value=value;
         java.util.Properties p = new java.util.Properties();
         p.setProperty("brand","Dell");
         p.setProperty("processor", "i5");
         p.setProperty("OS","Windows11");
         p.setProperty("model", "Inspiron");
         System.out.println(p);
         try {
             p.store(new FileOutputStream("K://Myjava/properties.txt"), "Laptop");
         }
         catch (FileNotFoundException e){
             System.out.println(e);
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
         return prop+ value;
     }
      public void StringTokenizer(){
         String data = "name= kush;address = rau;country= India;department=CSE";
         StringTokenizer stk =new StringTokenizer(data,"=;");
         String s;
         while(stk.hasMoreTokens()){
             s= stk.nextToken();
             System.out.println(s);
         }
      }
 }
public class HashTable {
    public static void main(String[] args){
        Hashtable<Integer, String > ht = new Hashtable<>();
        ht.put(1,"A");
        ht.put(2,"B");
        ht.put(3,"C");

        Enumeration e = ht.keys();
        Enumeration f= ht.elements();
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
            System.out.println(f.nextElement());
        }
        System.out.println();
        System.out.println(e);
        System.out.println(ht.get(2));
        System.out.println(ht);

        Properties p = new Properties();
        System.out.println(p.Property("Kush","sengar"));
        System.out.println();
        p.StringTokenizer();
    }
}
