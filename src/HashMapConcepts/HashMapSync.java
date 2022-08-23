package HashMapConcepts;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSync {
    public static void main(String[] args) {

        //synchronizedMap method in collections class:
        Map<String , String> map1 = new HashMap<>();
        map1.put("1", "Naveen");
        map1.put("2", "Tom");
        map1.put("3", "Lisa");

        //create synchronizedMap
        Map<String, String> syncMap = Collections.synchronizedMap(map1);
        System.out.println(syncMap);

        //concurrentHashMap: it does not throw any ConcurrentModificationException
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("A", "Java");
        concurrentHashMap.put("B", "Python");
        concurrentHashMap.put("C", "Ruby");
        System.out.println(concurrentHashMap.get("A"));
    }
}
