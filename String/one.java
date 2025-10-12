package String;
import java.util.*;
public class one{
    public static void print(String name){
        for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(0));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name;
        name=sc.nextLine();

        System.out.println(name);
        print(name);
    }
}
