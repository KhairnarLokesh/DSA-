public class classroom {
    static class Node{
        int data;
        Node left;
        Node right;
         Node(int data){
             this.data=data;
             this.left=null;
             this.right=null;
    }

    }
    static class binarytree{
        static int idx=-1;
        public static Node buildtree(int node[]){
            idx++;
            if(node[idx]==-1){
                return null;
            }
            Node newNode=new Node(node[idx]);
            new 

        }
    }

   
    public static void main(String[] args) {
        int node[]={1,2,4,-5,-1,5,-1,-1,3,-1,6,-1,-1};
    }
}
