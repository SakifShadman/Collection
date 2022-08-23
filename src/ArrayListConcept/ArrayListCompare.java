package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {
    public static void main(String[] args) {

        //How to compare two ArrayLists in Java
        //1. sort and the equals:
        ArrayList<String> l1 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "F"));
        ArrayList<String> l2 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));
        ArrayList<String> l3 = new ArrayList<>(Arrays.asList("B", "A", "C", "D", "F"));

        Collections.sort(l1);
        Collections.sort(l2);

        System.out.println(l1.equals(l2)); //false
        System.out.println(l1.equals(l3)); //false

        Collections.sort(l3);
        System.out.println(l1.equals(l3)); //true


        //2. compare two list - find out the additional elements:
        ArrayList<String> l4 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "F"));
        ArrayList<String> l5 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));

        l4.removeAll(l5);
        System.out.println(l4); //finds out the additional elements at l4 [F]


        //3. find out the missing elements:
        ArrayList<String> l6 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "F"));
        ArrayList<String> l7 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));

        l7.removeAll(l6);
        System.out.println(l7); //finds out the missing elements at l6 [E]


        //4. find out the common elements:
        ArrayList<String> lang1 = new ArrayList<>(Arrays.asList("Java", "Python", "Ruby", "C#", "JS"));
        ArrayList<String> lang2 = new ArrayList<>(Arrays.asList("Java", "Python", "Ruby", "C#", "PHP"));

        lang1.retainAll(lang2);
        System.out.println(lang1);
    }
}