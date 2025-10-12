public class subset {

    public static void printaubstring(String str,String ans,int i){
        if(i==str.length()){
            if(str.length()==0){
                System.out.println("null");
            }
            else{
                System.out.print(ans);
            }
            return;
        }
        //yes
        printaubstring(str, ans+str.charAt(i), i+1);
        //no
        printaubstring(str, ans, i+1);
    }




    public static void findpermutation(String str,String ans){
        if(str.length()==0){
            System.out.println(ans+"  ");
            return;
        }

//recursion 
            for(int i=0;i<str.length();i++){
                char curr=str.charAt(i);
                String newstr=str.substring(0,i)+str.substring(i+1);
                findpermutation(newstr, ans+curr);
            }




    }
    public static void main(String[] args) {
        String str="abc";
    findpermutation(str, "");
    }
}
