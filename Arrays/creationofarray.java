package Arrays;

import java.util.*;
public class creationofarray {
    
    public static void main(String[] args) {
        int marks[]=new int[50];
        Scanner sc=new Scanner(System.in);

        marks[0]=sc.nextInt(); //phy
        marks[1]=sc.nextInt();//math
        marks[2]=sc.nextInt();//chem

        System.out.println("physics= "+marks[0]);
        System.out.println("math= "+marks[1]);
        System.out.println("chemistry= "+marks[2]);
        marks[1]=100;
        System.out.println("math= "+marks[1]);

        
    }
}
