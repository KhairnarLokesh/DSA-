import java.util.*;
public class reverse {
    public static void placedatbottom(Stack<Integer> s,int data){
        while(s.isEmpty()){
            s.push(data);
            return;
        }

        int top=s.pop();
        placedatbottom(s, data);
        s.push(top);

    }
  


    public static void rever(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        rever(s);
        placedatbottom(s, top);



    }
      public static void printstack(Stack<Integer> s){
       while(!s.isEmpty()){
        System.out.println(s.pop());
       }
    }

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        rever(s);
        printstack(s);

    }
}
 