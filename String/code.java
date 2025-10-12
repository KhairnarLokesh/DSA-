
\

public class code {
    public static String toUppercase(String str){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
            int current =sb;
        for(int i=1;i<str.length();i++){
            if ((current == ' ' || current == ',' || current == '.' || current == '-') && i < str.length() - 1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String str="hi,i am lokesh";
        System.out.print(toUppercase(str));

    }
}
