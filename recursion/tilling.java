public class tilling {
    

    public static int problem(int n){
        if(n==0 || n==1){
            return 1;
        }

        int fnm1=problem(n-1);
        int fnm2=problem(n-2);

        int total=fnm1+fnm2;
        return total;
    }

    public static void main(String[] args) {
         System.out.println(problem(5));
    }
}
