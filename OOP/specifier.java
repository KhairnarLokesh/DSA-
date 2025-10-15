public class specifier {
    public static void main(String[] args) {
        BankAccount myAcc=new BankAccount();
       
        myAcc.setPassword("asdf");
        myAcc.setusername("lokesh");
        System.out.println(myAcc.username);
        // System.out.println(myAcc.username);
    }
}
class BankAccount{
   public String username;
   private String password;

  void setusername(String newusername){
   username=newusername;
   }
   public void setPassword(String pwd){
    password=pwd; 
   }
}