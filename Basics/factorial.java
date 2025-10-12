public class factorial {
        public static int lokesh (int n){
            int f=1;
            for(int i=1;i<=n;i++){
              f=f*i;

            }
            return f;
        }
        public static int binomial(int n,int r){
          int fact_n=lokesh(n);
          int fact_r=lokesh(r);
          int factmr=lokesh(n-r);
          int binomial=fact_n/(fact_r*factmr);
          return binomial;
        }
    public static void main(String[] args) {
      // int f=  lokesh(5);
      System.out.println(binomial(5,2));
    }
}
