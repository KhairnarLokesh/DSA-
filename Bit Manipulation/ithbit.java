public class ithbit {
    public static int getithbit(int n,int i){ //get ith bit
        int bitmask=(1<<i);
          if((n & bitmask)==0){
           return 0;
        }
        else{
            return 1;
        }
    }
    public static int setithbit(int n,int i){//set ith bit
        int bitmask=1<<i;
        return n|bitmask;
    }

    public static int clearithbit(int n,int i){
        int bitmask=~(1<<i);
        return( n & bitmask);
    }

    public static int updateithbit(int n,int i,int newbit){
        if(newbit==0){
            return(clearithbit(n, i));
        }
        else{
            return (setithbit(n, i));
        }
    }
    public static void main(String[] args) {
     System.out.println(updateithbit(n, i, newbit));
    }
}
