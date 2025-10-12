package Arrays;
import java.util.*;


public class smallest {
    
    public static int getsmallest(int arr[]){
        int small=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(small>arr[i]){
                small=arr[i];
            }
        }
        return small;
    }
    public static void main(String[] args) {
        int arr[]={5,6,9,7,11};
        System.out.println("smallest value is : "+getsmallest(arr));

    }
}
