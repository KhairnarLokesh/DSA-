    import java.util.*;
    public class matrices {

        public static void largest(int matrix[][]){
            int max=matrix[0][0];
            int min=matrix[0][0];
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    if(matrix[i][j]>max){
                        max=matrix[i][j];
                    }
                    if(matrix[i][j]<min){
                        min=matrix[i][j];
                    }
                }
            }
            System.out.println("largest element is "+max);
              System.out.println("smallest element is "+min);
        }

        public static  boolean search( int matrix[][], int key){
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("found at key"+i+"" +j+" ");
                    return true;
                }

                
                }
                
            

                }
                System.out.println("not found");
                return false;
        }
        public static void main(String[] args) {
            int matrix[][]=new int[3][3];
            int n=matrix.length, m =matrix[0].length;
            Scanner sc= new Scanner(System.in);
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    matrix[i][j]=sc.nextInt();
                }

            }
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print(matrix[i][j]+" ");
                
                }
                System.out.println();

                }
                search(matrix,9);
                largest(matrix);
            }
            
        }
            