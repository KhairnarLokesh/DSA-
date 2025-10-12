public class binarystring {
    public static void printbinstring(int n,int lastidx,String str){
        if(n==0){
            System.out.println(str);
            return ;    
        }
        printbinstring(n-1, 0, str+="0");
        if(lastidx==0){
              printbinstring(n-1, 1, str+="1"); 
        }
    }

    public static void main(String[] args) {
        printbinstring(3,0, "");
    }
}
