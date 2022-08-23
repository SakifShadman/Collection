package ArrayListConcept;

import java.util.ArrayList;

public class VirtualCapacity {
    public static void main(String[] args) {

        //default capacity of ArrayList is 10
        ArrayList<Object> ar = new ArrayList<>();
        //ArrayList<Object> ar = new ArrayList<>(20); //you can change the virtual capacity of Arraylist like this

        System.out.println(ar.size()); //PC = 0

        ar.add(100);
        System.out.println(ar.size()); //PC = 1

        ar.add(200);
        ar.add(300);
        ar.add(400);
        System.out.println(ar.size()); //PC = 4
    }
}