
import java.util.HashSet;

public class Q1 {
    

    public static void main(String[] args) {
        int arr[]={4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer> set=new HashSet<>();

        for(Integer ele:arr){
            set.add(arr[ele]);
        }

        System.out.println(set.size());
    }
}
