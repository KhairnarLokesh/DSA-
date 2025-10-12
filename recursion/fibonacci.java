public class fibonacci {
    
    public static int fib(int n){


        if(n==0 || n==1){
            return n;
        }
       
        int fin1=fib(n-1);
        int fin2=fib(n-2);
        int fibN=fin1+fin2;
        return fibN;
    }
    public static void main(String[] args) {
         int n=20;
         System.out.print(fib(n));
    }
}
