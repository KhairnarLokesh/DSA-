import java.util.Collection;

public class Q2 {
    public static int triplet(int nums){
        int result;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                       triplet.add(nums[i]);
                       triplet.add(nums[j]);
                       triplet.add(nums[k]);
                       Collection.sort(triplet);
                       result.add(triplet);


                    }
                }

                
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[]={-1,0,1,2,-1,-4};
        triplet(nums);
    }
}
