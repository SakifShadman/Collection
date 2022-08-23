package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
    public static void main(String[] args) {

        //default class
        //dynamic array

        //default generics:
        ArrayList<Object> ar = new ArrayList<>();
        ar.add(100); //0
        ar.add("testing"); //1
        ar.add('t'); //2
        ar.add(12.33); //3
        ar.add(true); //4

        System.out.println(ar);
        System.out.println(ar.get(1));
        //System.out.println(ar.get(-1)); //ArrayIndexOutOfBoundException

        System.out.println(ar.size());
        System.out.println("LI = " + 0);
        System.out.println("HI = " + (ar.size() - 1));

        ar.add(400); //5
        ar.add(500); //6

        System.out.println(ar.size());

        //list with another collection:
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(10,20,30,40));
        System.out.println(nums);

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Java", "Python", "JS", "PHP"));
        System.out.println(names);
    }
}