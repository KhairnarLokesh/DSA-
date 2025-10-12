public class substr {

    public static String sub(String str,int si,int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {

        String str="helloworld";
        // System.out.println("");
        // System.out.print(sub(str, 0, 5));
        System.out.print(str.substring(0,6));
    }
}
