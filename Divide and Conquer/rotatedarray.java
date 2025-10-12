
public class rotatedarray {
    

    public static int search(int arr[],int tar,int si,int ei){
        if(si>ei){
            return -1;
        }
        int mid=si+ei/2;
        if(arr[mid]==tar){
            return mid;
        }
        //L1
        if(arr[si]<=tar && tar<=arr[ei]){
            //case a

            if(arr[si]<=tar && tar<=arr[mid]){
                return  search(arr,tar,si, mid);
            }
            else{
             return   search(arr, tar, mid+1, ei);
            }
        }
        else{
           if(arr[mid]<=tar && tar<=arr[ei]){
                return search(arr, tar, mid+1, ei);
           } 
           else{
            return search(arr, tar, si, mid-1);
           }
        }
    }
    
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=0;
        int trgidx=search(arr, target, 0, arr.length-1);
      System.out.println(trgidx);
       
    }
}
