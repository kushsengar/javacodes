public class TrappedRainwater {
    public static int trapped_Water(int[] height) {
        int n = height.length;
        // for creating leftmax auxiliary array
        int[] leftmax = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
             leftmax[i]= Math.max(height[i],leftmax[i-1]);
        }
        //for creating rightmax auxilliary array
        int [] rightmax= new int[n];
        rightmax[n-1]= height[n-1];
        for (int i=n-2;i>=0;i--){
            rightmax[i]= Math.max(height[i],rightmax[i+1]);
        }
        // for calculating water level

        int trappedwater=0;
        for (int i=0;i<n;i++){
          int  waterlevel= Math.min(leftmax[i],rightmax[i]);
            trappedwater += waterlevel - height[i];
        }
        return trappedwater;
    }
    public static void main(String[] args){
        int[] height={4,2,0,6,3,2,5};
        System.out.println(trapped_Water(height));
    }
}
