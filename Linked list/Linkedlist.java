    ////structure to create the single node i the linkedlist

public class Linkedlist {
    public static class Node{
        int data;//data
        Node next;//reference variable

        public Node(int data){//constructor
            this.data=data;//initialize
            this.next=null;//there is null
        }
    }
    public static Node head;
    public  static Node tail;
    public static int size;


    public void addfirst(int data){         //Addfirst Method
        //step1 ceate a new node
        Node newNode=new Node(data);
        size++;

        if(head==null){
            head=tail=newNode;
            return;
        }
        //step2 newNode next=head
        newNode.next=head;//linked


        //step3-head=newNode

        head=newNode;

    
    }

    public void addlast(int data){      //Addlast Method
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
       
        tail.next=newNode;
        tail=newNode;
        
    }

    public void print(){
        if(head==null){
            System.out.println("linkedlist is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void addmiddle(int data,int idx){        //add at middle
        if(idx==0){
            addfirst(data);
            return;
        }
         Node newNode =new Node(data);
         size++;
         Node temp=head;
         int i=0;

         while(i<idx-1){
            temp=temp.next;
            i++;
         }

         //i=idx-1 ; temp->previous
         newNode.next=temp.next;
         temp.next=newNode;

    }



    ///REMOVE OPERATION

    public int removefirst(){

        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }

        if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    public int removelast(){            //remove last method

        if(size==0){
            // System.out.println("ll is empty");
            return Integer.MIN_VALUE;

        }

        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }

        //previous index -> size-2
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }


    public int search(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
              
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }


    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;


        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }


    public void removenth(int n){
        //size of ll

        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }


        if(n==size){            //last se n yane size 
            head=head.next;//remove first opern
            return;
        }


        //size-n
        int i=0;
        int itofind=size-n;
        Node prev=head;
        while(i<itofind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;

    }

    //palindrome ll code
    //using slow fast appraoch 
    public Node findmid(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next; //+1
            fast=fast.next.next; //+2
        }
        return slow; //slow is y middle
    }


    public boolean checkpalindrome(){

        if(head==null || head.next==null){
            return true;
        }
        //step1 find mid
        Node midNode=findmid(head);


        // step2 reverse second haif

        Node prev=null;
        Node curr=midNode;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node right=prev;//right haif head
        Node left=head;




        // step 3 check left haif and rigth haif
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    public static  boolean Detectcycle(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return true;
            }
  
        }
        return false;
    }


    public static void removecycle(){
        //step 1 detect the cycle 
        Node slow=head;
        Node fast=head;

        boolean iscycle=false;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                iscycle=true;
                break;
            }
        }
        if(iscycle==false){
            return;

        }

        //step 2 find the meeting point

        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        //remove cycle ->last.next=null  karna hai
        prev.next=null;

    }


    //MERGE SORTED LINKEDLIST

    public Node getmid(Node head){
        Node slow=head;
        Node fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;
    }

    public Node merge(Node head1,Node head2){
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;

        while(head1!=null &&head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
               temp.next=head1;
                head1=head1.next;
                temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
                head2=head2.next;
                temp=temp.next;
        }
        return mergedLL.next;
    }
    public Node mergesort(Node head){
        if(head==null || head.next==null){
            return head;
        }
    

    //find mid
    Node mid=getmid(head);
    //left & right merfe sort
    Node righthead=mid.next;
    mid.next=null;
    Node newleft=mergesort(head);
    Node newright=mergesort(righthead);


    //merge
    return merge(newleft,newright);
    }



    public void zigzag(){
         if (head == null || head.next == null) return;
        Node slow;
        Node fast;
        slow=head;
        fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;
        //reverse 2nd haif
        
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        Node left=head;
        Node right=prev;
        Node nextL;
        Node nextR;

        //alternative merge

        while(left!=null && right!=null){
           nextL=left.next;
           left.next=right;
           nextR=right.next;
           right.next=nextL;

            left=nextL;
            right=nextR;
           

        }

    }

public static void main(String[] args) {
    Linkedlist ll = new Linkedlist();  // your own custom class

    ll.addfirst(1);
    ll.addfirst(2;
    ll.addfirst(3);
    ll.addfirst(4);

    ll.print(); 

    ll.zigzag();
    ll.print();
}
}

            


        
