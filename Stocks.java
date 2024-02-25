public class Stocks {
    public static int best_Time(int[] prices){
        int bp= Integer.MAX_VALUE;
        int mp=0;
        for (int i=0;i<prices.length;i++){
            if (bp<prices[i]){
                int profit= prices[i]-bp;
                mp= Math.max(profit,mp);
            }

            else {
                bp= prices[i];
            }
        }
        return mp;
    }
    public static void main(String[] args){
        int[] prices= {7,1,5,3,6,4};
        System.out.println(best_Time(prices));
    }
}
