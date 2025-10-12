import java.util.*;
public class framework {
    

    public static void main(String[] args) {
        
        LinkedList<Integer> ll=new LinkedList<>();

        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();
        System.out.print(ll);
    }
}
