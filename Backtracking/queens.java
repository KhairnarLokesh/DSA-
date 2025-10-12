public class queens {
     
    //fuction for print the board
    public static void printboard(char board[][]){
             System.out.println("---------chessboard------------");
        for(int i=0;i<board.length;i++){
       
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static boolean issafe(char board[][],int row,int col){


        //vertical up

        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }


        //diagonal left up
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //diagona; right up 

        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    //function for placed the n queens in n rows
    public static void nQueens(char board[][],int row){
        if(row==board.length){ //base case
            // printboard(board);
            count++;
            return;
        }

///col loop
        for(int j=0;j<board.length;j++){
          if(issafe(board,row,j)){
            board[row][j]='Q';
            nQueens(board, row+1);//function call
            board[row][j]='X';//backtrack
        }
          }
          
    }

   static  int count=0;

    public static void main(String[] args) {
        int n=100;
        char board[][]=new char[n][n];

        //initialize

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
        }
        nQueens(board, 0);
        System.out.println("total ways to solve n queens:"+count);
    }
}
