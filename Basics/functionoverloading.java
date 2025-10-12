public class functionoverloading {

    //calculate sum 2 no
     public static int sum(int a,int b){
        return a+b;
        }

         public static int sum(int a,int b,int c){
            return a+b+c;
        }
    public static void main(String[] args) {
       sum(2, 4);
       
         System.out.println("sum is"+sum(2, 6));
         System.out.println( sum(2, 2, 2));
    }
   
}
