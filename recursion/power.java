public class power {
    public static int pow(int x,int n){
        if(n==1){
            return x;
        }

        int xnm1=pow(x,n-1);
        int xn=x*xnm1;
        return xn;
    }

    public static void main(String[] args) {
    System.out.print(pow(2, 2));
    }
}
  