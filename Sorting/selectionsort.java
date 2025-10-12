import java.util.*;
public class selectionsort {
    public static void selection(int array[]){
        for(int i=0;i<array.length;i++){
            int minpos=i;
            for(int j=i+1;j<array.length;j++){
                if(array[minpos]>array[j]){
                    minpos=j;
                }
            }
            int temp=array[minpos];
            array[minpos]=array[i];
            array[i]=temp;
        }
    }


public static void main(String[] args) {
    int array[]={5,4,1,3,2};
    selection(array);
    for(int num:array){
        System.out.print(num+"      ");
    }
}
}
