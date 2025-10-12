import java.util.*;
public class bill {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of pen");
        float a=sc.nextFloat();
        System.out.println("Enter the value of Pencil");
        float b=sc.nextFloat();
        System.out.println("Enter the value of eraser");
        float c=sc.nextFloat();
        float sum=(a+b+c);
        System.out.println("the total sum is :"+sum);
    }
}
