public class occurence {
    

    public static int first(int arr[], int target,int i){

        if(i==arr.length){
            return -1;
        }
            if(arr[i]==target){
            return i;
        }
        return first(arr,target,i+1);  
    }
    public static int last(int arr[],target,int i){
        if(i==arr.length){
            return -1;
        }

        for(int i=arr.length-1;i>n;i--){
            if()
        }
    }

    public static void main(String[] args) {
        int arr[]={8,3,6,9,5,10,2,5,3};
        
        System.out.println(first(arr, 5,0));
    }
}
