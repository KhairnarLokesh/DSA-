import java.util.*;
public class jobsequensepronlem {
    
    public static class  Job{
        int deadline;
        int profit;
        int id;//0(A),1(B),2(C),3(D)

        public Job(int i,int d,int p){
            id=i;
            deadline=d;
            profit=p;
           
        }
    }

    public static void main(String[] args) {
        int jobinfo[][]={{4,20},{1,10},{1,40},{1,30}};
         

        ArrayList<Job> jobs=new ArrayList<>();
        for(int i=0;i<jobinfo.length;i++){
            jobs.add(new Job(i,jobinfo[i][0],jobinfo[i][1]));
             
        }
    
        Collections.sort(jobs,(a,b)->b.profit-a.profit);//ascenting order of profit
        ArrayList<Integer> seq=new ArrayList<>();
        int time=0;
          for(int i=0;i<jobs.size();i++){
            Job curr=jobs.get(i);

            if(curr.deadline>time){
                seq.add(curr.id);
                time++;
            }
          }
          System.out.println("max jobs:"+seq.size());

          for(int i=0;i<seq.size();i++){
            System.out.println(seq.get(i));
          }
    }



}
