public class sumofnnaturalno {
    public static int sum(int n){

        if(n==1){
            return 1;
        }
        int snm1=sum(n-1);
        int sm=n+snm1;
        return sm;
    }

    public static void main(String[] args) {
        int n=5;

        System.out.print(sum(n));
    }
}
