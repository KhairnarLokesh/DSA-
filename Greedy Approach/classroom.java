import java.util.*;
public class classroom {
    

    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};

        //sorting

        int activities[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }

        //lambda function
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));

        //end time baes sorted

        int count=0;
        ArrayList<Integer> ans =new ArrayList<>();
        count=1;
        ans.add(activities[0][0]);
        int lastend=activities[0][2];
        for(int i=1;i<end.length;i++){
            if(activities[i][1]>=lastend){
                count++; 
                ans.add(activities[i][0]);
                lastend=activities[i][2];

            }
             
        }
        System.out.println("max activity:"+count);

        for(int i=0;i<ans.size();i++){
            System.out.println("A"+ans.get(i)+"");
        }
        System.out.println();
    }
}
 