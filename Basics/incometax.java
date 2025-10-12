import java.util.Scanner;

public class incometax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the income:");
        int income=sc.nextInt();
        if(income<5){
            System.out.println("0% tax");
        }
        else if(income<=10||income==5){
            System.out.println("20% tax");

        }
        else if(income>10){
            System.out.println("30% tax");
        }
    }
}
