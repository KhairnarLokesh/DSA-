public class mergesort {
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
 
    }

    public static void mergesort(int arr[],int si,int ei){
        //base case

        if(si>=ei){
            return;
        }

        //kaam

        int mid=(si+ei)/2;

        mergesort(arr, si, mid);//left part
        mergesort(arr, mid+1, ei);//right part
        merge(arr,si,mid,ei);
    }

    public static void merge(int arr[],int si,int mid,int ei){ 


        //left1(0,3)=4 elements  rigth(4,6)=3 elements->6-0+1=7
        int temp[]=new int[ei-si+1];

        int i=si;//iterator for left part
        int j=mid+1;//iterator for right part

        int k=0;//iterator for temp arr


        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                    i++;
                  
            }
            else{
                temp[k]=arr[j];
                j++;
              
            } 
             k++;

        }
        //left
        while(i<=mid){
            temp[k++]=arr[i++];
        }

        //right

        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //copy my temporary to originaasl

        for( k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k]; 
        }
    }

    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        mergesort(arr,0,arr.length-1);
        printarr(arr);
               
    }
}
