public class evenodd {
    public static void oddeven(int n){
        int bitmask=1;
        if((n&bitmask)==0){
           //even
           System.out.println("even");

        }
        else{
            System.out.println("odd");
        }

    }
    public static void main(String[] args) {
            oddeven(695);        

        }
    }

