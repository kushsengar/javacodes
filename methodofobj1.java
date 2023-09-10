public class methodofobj1 {
    static void update(int A[]){ // here A[] is object reference and it points towards object.
        A[0]= 25;
    }
    public static void main(String[] args){
        int A[]={2,3,4,5,6};
        update(A);
        System.out.println(A[0]);//therefore value of A[0] is updated to 25
    }
}
