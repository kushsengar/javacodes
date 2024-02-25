import java.util.*;

public class linkedlistandquedemo {

    public void ArrayList(){
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
    public void linkedlist(){
        LinkedList<Integer> ll1= new LinkedList<>();
        for (int i=1;i<11;i++){
            int x= 3 * i;
            ll1.add(x);
        }
        for (Integer n:ll1) {
            System.out.println(n);
        }
        LinkedList<Integer> ll2= new LinkedList<>(List.of(33,36,39,42,45));
        ll1.addAll(ll2);
        for (Integer n:ll1) {
            System.out.println(n);
        }
    }
    public void ArrayDeque(){
        ArrayDeque<Integer> dq= new ArrayDeque<>();
        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);
        dq.offerLast(50);
        dq.pollFirst();
        dq.forEach((x)-> System.out.println(x));
    }

    public void PriorityQueue(){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(15);
        pq.add(12);
        pq.add(9);
        pq.add(6);
        pq.add(3);
        pq.add(-1);
        pq.poll();
        System.out.println(pq.peek());
        pq.forEach((x)-> System.out.println(x));

    }

    public static void main(String[] args){
        linkedlistandquedemo llnqd= new linkedlistandquedemo();
     //   llnqd.linkedlist();
//llnqd.ArrayDeque();
//llnqd.ArrayList();
   llnqd.PriorityQueue();
    }
}
