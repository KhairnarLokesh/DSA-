public class pre {
    public static void  printsum( int numbers[]){
        int currsum=0;
        int maxsum=Integer.MAX_VALUE;


        for(int i=0;i<numbers.length;i++){
            int start=i;

            for(int j=i;j<numbers.length;j++){
                int end=j;
                currsum=0;

                for(int k=start;k<=end;k++){
                   currsum+=numbers[k];
                }

                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
               
            }
           

        }
        System.out.println("max sum"+maxsum);

    }

