package HashMapConcepts;

import java.util.*;

public class HashMapToArrayList {
    public static void main(String[] args) {

        HashMap<String, Integer> compMap = new HashMap<>();
        compMap.put("Google", 10000);
        compMap.put("Walmart", 20000);
        compMap.put("Amazon", 30000);
        compMap.put("Facebook", 5000);
        compMap.put("Cisco", 15000);

        System.out.println("Comp map size: " + compMap.size());

        Iterator it = compMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pairs = (Map.Entry)it.next();
            System.out.println(pairs.getKey() + " = " + pairs.getValue());
        }
        System.out.println("**************************************");


        //print key and values by using lambda
        compMap.forEach((k,v) -> System.out.println("key = " + k + " value = " + v));
        System.out.println("**************************************");


        //convert HashMap keys into ArrayList:
        List<String> compNamesList = new ArrayList<>(compMap.keySet());
        System.out.println("Total comp size: " + compNamesList.size());
        for (String t : compNamesList) {
            System.out.println(t);
        }
        System.out.println("**************************************");


        //convert HashMap values into ArrayList:
        List<Integer> empValuesList = new ArrayList<>(compMap.values());
        System.out.println("Total emp values size: " + empValuesList.size());
        for (Integer e : empValuesList) {
            System.out.println(e);
        }
    }
}