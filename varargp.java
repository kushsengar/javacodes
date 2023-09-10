public class varargp {
  // this program showcases the use of variable arguments.
    static void show(int ...A){
        for( int x: A){
            System.out.println(x);

    }}

    // here I have used method overloading and variable arguments together

    static void show(String ...S){
        for(int i=0;i< S.length;i++){
            System.out.println(i+1 +"."+ S[i]);
        }
    }
    public static void main(String[] args){
      // show();
       show(10,20,30,40,50);
       show(new int[]{1,2,3,4,5,6,7,8,9,10,12});
       show("kush","khushi","anuj","lovely","lalit","anurita","mamta","amit");
    }
}
