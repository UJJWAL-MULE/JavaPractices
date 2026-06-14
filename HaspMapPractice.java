import java.util.HashMap;

public class HaspMapPractice {
  public static void main(String[] args ){
    HashMap<String , Integer> data = new HashMap<>();  // HashTable same to hashmap but is synchronised

    data.put("a",1 );
        data.put("b",1 );
      
        for (String name : data.keySet()){
          System.out.println(data.get(name));
        }


  }
}
