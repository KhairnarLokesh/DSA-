import java.util.*;
public class insertion {
    public static void insertionsort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n-1;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]> curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }

    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        insertionsort(arr);
         for(int num:arr){
        System.out.print(num+"      ");
    }
    }
}
