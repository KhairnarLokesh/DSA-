public class friendspairingproblem {
    public static int friends(int n){
        if(n==1 ||n==2){
            return n;
        }


        int fnm1=friends(n-1);
        int fnm2=friends(n-2);
        int pairedways=(fnm1*fnm2);
       int total=pairedways*fnm1;
       return total;
    }

    public static void main(String[] args) {
       int n=3;
        System.out.println(friends(n));

    }
}
