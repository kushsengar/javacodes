import java.util.*;
public class listdemo {
    public static void main(String[] args){
    ArrayList<Integer> al1 = new ArrayList<>(20);
    ArrayList<Integer> al2 = new ArrayList<>(List.of(2,3,4,5,6));
       al1.add(10);
       al1.add(0,15);
    al1.addAll(1,al2);
    al1.add(6,6);
    al1.set(6,100);

//        System.out.println(al1);
//
//        System.out.println(al1.contains(55));
//
//        System.out.println(al1.get(5));
//
//        System.out.println(al1.indexOf(6));
//
//        System.out.println(al1.lastIndexOf(6));
//   for (int i=0;i< al1.size();i++ ){
//       System.out.print(al1.get(i)+" ");
//   }
//        for (var x:al1) {
//            x++;
//            --x;
//            System.out.print(x+ " " );
//
//        }
//        ListIterator<Integer> it = al1.listIterator();
//        while(it.hasNext()){
//            System.out.print(it.next()+ " ");
//        }
// for (ListIterator<Integer> it = al1.listIterator(); it.hasNext();){
//     System.out.print(it.next()+" ");
// }
//         al1.forEach(System.out::println);
//  al1.forEach(n-> System.out.println(n));
        al1.forEach(listdemo::show);

    }
    static void show(int n){
        if(n>=10)
            System.out.println(n);
    }
}
