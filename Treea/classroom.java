
import java.util.*;

public class classroom {
    
    static class Node{
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{
        static int idx=-1;
        public  static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx]==-1){
                return null;
            }

            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }

        //level oredr traversal
        public static void levelorder(Node root){
            if(root==null){
                return;
            }

            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode=q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                    
                    }
                    else{
                        System.out.print(currNode.data+" ");
                        if(currNode.left!=null){
                            q.add(currNode.left);
                        }
                        if(currNode.right!=null){
                            q.add(currNode.right);
                        }
                }
            }
        }   


        //PREORDER TRAVERSAL
        public static void preorder(Node root){
            if(root==null){
                return;
            }
            System.out.println(root.data+" ");
            preorder(root.left);
            preorder(root.right);

        }


        //INorder TRAVERSAL

        public static void inorder(Node root){

            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);

            
        }

        //POSTORDER TRSVRSAL

        public static void postorder(Node root){
            if(root==null){
                return;
            }

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }



        //height of the tree (Node form)

        


    }   
    public static int calculateheuight(Node root){
            if(root==null){
                return 0;
            }
            int leftht;
            int rightht;
            int bight;
            leftht=calculateheuight(root.left);
            rightht=calculateheuight(root.right);
            bight=Math.max(leftht,rightht)+1;

            return bight;
            
        }

        public static int diameter2(Node root){

            if(root==null){
                return 0;
            }
            int leftdiameter=diameter2(root.left);
            int leftH=calculateheuight(root.left);
            int rightdiameter=diameter2(root.right);
            int rightH=calculateheuight(root.right);


            int selfdiameter=leftH+rightH+1;

           return  Math.max(selfdiameter,Math.max(leftdiameter,rightdiameter));



  
        }
        // static class Info{
        //     int diam;
        //     int ht;

        // public Info(int diam,int ht) {
        //     this.diam=diam;
        //     this.ht=ht;
        // }

            
        // }

        // public static Info diameter(Node root){

        //     if(root==null){
        //         return new Info(0,0);
        //     }
        //     Info leftInfo=diameter(root.left);
        //     Info rightInfo=diameter(root.right);

        //     int diam=Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
        //     int ht=Math.max(leftInfo.ht,rightInfo.ht)+1;

        //     return new Info(diam,ht);

        // }

        // public static boolean isIdentical(Node root,Node subRoot){
        //     if(root==null && subRoot==null){
        //         return true;
        //     } 
        //     else if(root ==null || subRoot==null || root.data!=subRoot.data){
        //         return false;
        //     }
        //     if(!isIdentical(root.left, subRoot.left)){
        //         return false;
        //     }
        //     if(!isIdentical(root.right, subRoot.right)){
        //         return false;
        //     }

        //     return true;
        // }

        // public static boolean isSubtree(Node root,Node subRoot){
        //     if(root==null){
        //         return false;
        //     }
 
        //     if(root.data==subRoot.data){
        //        if(isIdentical(root,subRoot)){
        //               return true;
                
        //        }
          
        //     }
            

        //      return isSubtree(root.left, subRoot) ||isSubtree(root.right, subRoot);

        // }

        static class Info{
            Node node;
            int hd;

            Info(Node node,int hd){
                this.node=node;
                this.hd=hd;
            }
        }
        public static void TopView(Node root){


            Queue<Info> q=new LinkedList<>();
            HashMap<Integer,Node> map=new HashMap<>();

            int min=0;
            int max=0;
            q.add(new Info(root,0));
            q.add(null);


            while(!q.isEmpty()){
                Info curr=q.remove();
                if(curr==null){
                    if(q.isEmpty()){

                        break;
                    }
                    else{
                        q.add(null);
                    }
                }

               else{
                 if(!map.containsKey(curr.hd)){//first tie occurance
                    map.put(curr.hd,curr.node);
                }

                if(curr.node.left != null){
                    q.add(new Info(curr.node.left, curr.hd-1));
                    min = Math.min(min,curr.hd-1);
                }
                if(curr.node.right!=null){
                    q.add(new Info(curr.node.right,curr.hd+1));
                        max=Math.max(max,curr.hd+1);
                    
                }

            }
               }
            
            for(int i=min;i<=max;i++){
                System.out.print(map.get(i).data);
            }
            System.out.println( );
        }
       

        public static boolean getpath(Node root,int n,ArrayList<Node> path){


            if(root==null){
                return false;
            }
            path.add(root);
            if(root.data==n){
                return true;
            }

            boolean findleft= getpath(root.left,n,path);
            boolean findright=getpath(root.right,n,path);

            if(findleft||findright){
                return true;
            }

            path.remove(path.size()-1);
            return false;
        }
        public static Node lca(Node root,int n1,int n2){
            ArrayList<Node> path1=new ArrayList<>();
            ArrayList<Node> path2=new ArrayList<>();

            getpath(root,n1,path1);
            getpath(root,n2,path2);


            //lca

            int i=0;
            for(;i<path1.size()&& i<path2.size();i++){
                if(path1.get(i)!=path2.get(i)){
                    break;
                }
            }



            //last equal node>i-1
            Node lca=path1.get(i-1); 
            return lca;
        }

    public static void main(String[] args) {
        
        /* 
         
        */
       Node root=new Node(1);
       root.left=new Node(2);
       root.right=new Node(3);
       root.left.left=new Node(4);
       root.left.right=new Node(5);
       root.right.left=new Node(6);
       root.right.right=new Node(7);
       int n1=4,n2=5;

       System.out.println(lca(root, n1, n2).data);

        // TopView(root);
    //    Node subRoot=new Node(2);
    //    subRoot.left=new Node(4);
    //    subRoot.right=new Node(5);


    //    System.out.println(isIdentical(root, subRoot));
    }
}
