public class practicequestion1 {
    public  static void findindex (int arr[],int key,int index){
        if(index==arr.length){
            return;
        }

        if(arr[index]==key){
            System.out.print(index);
        }
        findindex(arr,key,index+1);

     
    }

    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
       int key=2;
       findindex(arr,key,0);

    }
}
