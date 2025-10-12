public class bitoperation {
    public static int getbit(int n,int i){
        int bitmask=1<<i;
        if((n& bitmask)==0){
          return 0;
        }
        else{
            return 1;
        }
    } 
    public static int setbit(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;

    }

    public static int clearbit(int n,int i){
        int bitmask=~(1<<i);
        return (n & bitmask);
    }

        public static int updatebit(int n,int i,int newbit){
        int bitmask=i<<i;

        if(bitmask==0){
            return clearbit(n,i);
        }
        else{
            return setbit(n, i);
        }
        }
        public static int clearlastbit(int n,int i){
        int bitmask=(-1<<i);
        return (n&bitmask);
    }


    public static int clearrange(int n,int i,int j){
        int bitmaskofA=(-1<<(j+1));
        int bitmaskofB=(1<<i)-1;
        int bitmask=bitmaskofA|bitmaskofB;
        return bitmask &n;

    }
    public static void main(String[] args) {
        // System.out.println(getbit(10, 2));
            // System.out.println(setbit(10, 2));
            // System.out.println(clearbit(10, 1));
                // System.out.println(updatebit(10, 2,1));
                // System.out.println(clearlastbit(15, 2));
                 System.out.println(clearrange(10, 2, 4));

    }
}
