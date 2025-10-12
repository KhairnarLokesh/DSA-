public class odd {
    public static void even(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }

    public static void main(String[] args) {
        even(3);
    }
}
