import java.util.*;
public class largest{
    public static int getlargest(int elements[]){
        int larg=Integer.MIN_VALUE; //-infinity
        for(int i=0;i<elements.length;i++){
            if(larg<elements[i]){
                larg=elements[i];
            }
        }
        return larg;
    }
    public static void main(String[] args) {
        int elements[]={1,2,6,3,5};
        System.out.println(getlargest(elements));
    }

}
    
