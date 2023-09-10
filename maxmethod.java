public class maxmethod {
      static int max(int x, int y){// x & y are formal parameters

          if (x>y)
              return x;
          else
              return y;
      }
      public static void main(String[] args){
        int a=15, b=18,c;
        c= max(a,b); // here a & b are actual parameters
          System.out.println(c);
    }
}
