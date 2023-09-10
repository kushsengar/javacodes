public class sumusingvarargs {
    static double sum(double ...S) {
        double sum = 0;
        for (int i = 0; i < S.length; i++)
            sum = sum + S[i];

        if(sum<500) return sum*0.10;
        else if(sum>=500 && sum<1000) return sum*0.15;
        else return sum*0.20;

    }
    public static void main(String[] args){
        System.out.println(sum());
        System.out.println(sum(522,455));
    }



    }


