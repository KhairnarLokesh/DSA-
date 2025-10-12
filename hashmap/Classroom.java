
import java.util.*;

public class Classroom {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();

        //put operation
        hm.put("lokesh",123);
        hm.put("om",156);
        hm.put("loki",196);
        hm.put("mohit",13);
        hm.put("lokesh",123);  
           
      Set<String> keys=hm.keySet();
      System.out.println(keys);

      for (String k : keys) {
      System.out.println("keys " +k+ ",value="+hm.get(k));
      }

     
       
    }
}
