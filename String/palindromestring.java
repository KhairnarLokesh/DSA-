public class palindromestring {
    public static boolean ispalindrome(String str){
        
        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
          if(str.charAt(i)==str.charAt(n-1-i)){
              return true;
          }

         
        }
       return false;
    }    

    public static void main(String[] args) {
        String str="Lokesh";
        System.out.println(ispalindrome(str));

    }
}
