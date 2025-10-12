import java.util.*;
public class implementation_of_stack_using_deque {
    static class Stack{
        Deque<Integer> d=new LinkedList<>();
        public  void push(int data){
          d.addLast(data);
        }
        public int pop(){
            return d.removeLast();
        }
        public int peek(){
            return d.removeLast();
        }
    }

    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println("peek is"+s.peek());
       System.out.println(s.pop());
    }
}
