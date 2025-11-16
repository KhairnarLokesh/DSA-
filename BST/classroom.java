
import java.util.ArrayList;


    public class classroom {
        static class Node{
            int data;
            Node left;
            Node right;

            public Node(int data) {
                this.data=data;
                this.left=null;
                this.right=null;
            }
        }
            public static  Node insert(Node root,int key){
                if(root==null){
                    return new Node(key);
                }
                if(key<root.data){
                    root.left=insert(root.left,key);
                }
                else{
                    root.right=insert(root.right, key);
                }
                return root;
            }

            public static void inorder(Node root){
                if(root==null){
                    return;
                }
                inorder(root.left);
                System.out.print(root.data +" ");
                inorder(root.right);
            }
            public static Node search(Node root,int key){
                if(root==null||root.data==key){
                    return root;
                }
                if(key<root.data){
                    return search(root.left, key);
                }
                else{
                    return search(root.right,key);
                }
            }
            public static Node delete(Node root, int key){
                if(root==null)
                {
                    return root;
                }
                if(key<root.data){
                    root.left=delete(root.left, key);

                }
                else if(key>root.data){
                    root.right=delete(root.right, key);
                }
                else{
                    if(root.left==null){
                        return root.right;
                    }
                    else if(root.right==null){
                        return root.left;
                    }

                    Node IS=findinordersuccessor(root.right);
                root.data=IS.data;
                root.right=delete(root.right,IS.data);
                }
            return root;
            }
            public static Node findinordersuccessor(Node root){
                while(root.left!=null){
                    root=root.left;
                }
             
                return root;
                
            }

            //print the path



            public static void printpath(ArrayList<Integer> path){
                for(int i=0;i<path.size();i++){
                    System.out.print(path.get(i)+"->");
                }
                System.out.println("null");
            }
            public static void printroot2leaf(Node root,ArrayList<Integer> path){
                if(root==null){
                    return;
                }
                path.add(root.data);
                if(root.left==null && root.right==null){
                    printpath(path);
                }
                printroot2leaf(root.left, path);
                printroot2leaf(root.right, path);
                path.remove(path.size()-1);

            }
              public static Node createmirror(Node root){
                if(root==null){
                    return null;
                }
                Node leftmirror=createmirror(root.left);
                Node rightmirror=createmirror(root.right);

                root.left=rightmirror;
                root.right=leftmirror;
                return root;
            }

            public static void preorder(Node root){
                if(root==null){
                    return;
                }
                System.out.println(root.data);
                preorder(root.left);
                preorder(root.right);
            }
            public static void getinorder(Node root,ArrayList<Integer> inorder){
                if(root==null){
                    return;
                }
                getinorder(root.left, inorder);
                inorder5.add(root.data);
            }
            public static Node balancebst(Node root){
                ArrayList<Integer> inorder5=new ArrayList<>();

            }




            public static Node createbst(int arr[],int st,int end){
                if(st>end)
                {
                    return null;
                }
                int mid=(st+end)/2;
                Node root=new  Node(arr[mid]);
               root.left= createbst(arr, st, mid-1);
                root.right= createbst(arr, mid+1, end);
                return root;
            }

            //mirror image question

          

            public static void main(String[] args) {
    //             int values[]={8,5,3,1,4,6,10,11,14};
    //             Node root=null;

    //             for(int i=0;i<values.length;i++){
    //                 root=insert(root,values[i]);
    //             }
    //             inorder(root);
    //             // int key=2;
    //             // Node result=search(root,key);

    //             // if(result==null){
    //             //     System.out.println("not found");
    //             // }
    //             // else{
    //             //     System.out.println("sound");
    //             // }

    // //              root = delete(root, 3);
    // // System.out.print("After deleting 3: ");
    // // inorder(root);
    //         printroot2leaf(root,new ArrayList<>());

                    Node root=new Node(8);
                    root.left=new Node(6);
                    root.left.left=new Node(5);
                    root.left.left.left=new Node(3);
                    root.right=new Node(10);
                    root.right.right=new Node(11);
                    root.right.right.right=new Node(12);


                // root=createmirror(root);
                // preorder(root);

            // int arr[]={3,5,6,8,10,11,12};
            // Node root=createbst(arr, 0, arr.length-1);
            // preorder(root);

            }   


            
        }

