public class sumofnuminsecondrow {
    public static void nums(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){

                if(i==1){
                      sum=sum+arr[1][j];
                }
              
            }
             
        }
         System.err.println("sum is"+" "+sum);
      
    }

    public static void main(String[] args) {
        int arr[][]={{1,4,9},{11,4,3},{2,2,3}};
        nums(arr);
    }
}
