package HashMapConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapBasics {
    public static void main(String[] args) {

        //no order - no indexing
        //stores values -- Key-Value <k,v>
        //key can not be duplicate
        //can store n number of null values but only one null key
        //hashmap is not thread-safe - unsynchronized

        HashMap<String, String> capitalMap = new HashMap<>();
        capitalMap.put("USA", "Washington DC");
        capitalMap.put("India", "New Delhi");
        capitalMap.put("UK", "London");
        capitalMap.put("UK", "London11");
        capitalMap.put(null, "Berlin");
        capitalMap.put(null, "Dhaka");
        capitalMap.put("Russia", null);
        capitalMap.put("France", null);
        capitalMap.remove("France");

        System.out.println(capitalMap.get("USA"));
        System.out.println(capitalMap.get("Uk"));
        System.out.println(capitalMap.get(null));
        System.out.println(capitalMap.get("France"));

        //iterator: over the keys: by using keySet()
        Iterator<String> it = capitalMap.keySet().iterator();

        while (it.hasNext()) {
            String key = it.next();
            String value = capitalMap.get(key);
            System.out.println("key = " + key + " value = " + value);
        }
        System.out.println("***********************");


        //iterator: over the set (pair): by using entrySet
        Iterator<Map.Entry<String, String>> it1 = capitalMap.entrySet().iterator();

        while (it1.hasNext()) {
            Map.Entry<String, String> entry = it1.next();
            System.out.println("key = " + entry.getKey() + " add value = " + entry.getValue());
        }
        System.out.println("***********************");


        //iterate hashMap using java 8 for each and lambda:
        capitalMap.forEach((k,v) ->System.out.println("key = " + k + " and value = " + v));
    }
}