import java.util.*;
public class HashMapBasic{
    public static void main(String[] args) {

        //CREATE
        HashMap<String, Integer> hm = new HashMap<>();

        //insert-O(1);
        hm.put("india", 20);
        hm.put("china", 100);
        hm.put("europe", 70);
        hm.put("us",41);

        //get-O(1)
       hm.get("india"); 

       //ContainsKey  -- return boolean values -- true or false --O(1)
       hm.containsKey("europe");

       //Remove O(1)
        hm.remove("china");


        //Get Size of hash map
        hm.size();

        //clear the hash map data
        hm.clear();

        //isEmpty
        System.out.println(hm.isEmpty());


       System.out.println(hm);
       System.out.println(hm.size());


    //----------ITERATION ON HashMap---------

    // //CREATE
    // HashMap<String, Integer> hm = new HashMap<>();

    // //insert-O(1);
    // hm.put("india", 20);
    // hm.put("china", 100);
    // hm.put("europe", 70);
    // hm.put("us",41);

    // //iteration on hashMap

    // Set<String> keys = hm.keySet();

    // System.out.println(keys);  //[china, india, europe, us]


    // //for each loop

    // for (String j : keys) {
    //     // System.out.print(j+" ");
    //     System.out.println("key="+j+", value="+hm.get(j));
    // }
  



   
}




       
       
    }



