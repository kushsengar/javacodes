import java.util.TreeSet;

public class point implements Comparable {
    int x;
    int y;
    public point(int x, int y){

        this.x= x;
        this.y= y;

    }
    public String toString(){
         return "x="+x+"y="+y;
    }


    public static void main(String [] args){
        TreeSet<point> ts= new TreeSet<>();
        ts.add(new point(1,1));
        ts.add(new point(2,10));
        ts.add(new point(3,3));
        ts.add(new point(2,4));

        System.out.println(ts);


    }

    @Override
    public int compareTo(Object o) {
        point p= (point) o;
        if(this.x< p.x)
            return  -1;
        else if (this.x> p.x)
            return 1;

        else{
            if(this.y<p.y)
                return -1;
            else if (this.y> p.y)
                return 1;
            else
                return 0;
        }
    }
}
