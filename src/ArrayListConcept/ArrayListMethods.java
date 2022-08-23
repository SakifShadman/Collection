package ArrayListConcept;

import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<String> ar1 = new ArrayList<>();
        ar1.add("java");
        ar1.add("python");
        ar1.add("ruby");
        ar1.add("javascript");

        ArrayList<String> ar2 = new ArrayList<>();
        ar2.add("testing");
        ar2.add("dev ops");

        /*ar1.addAll(ar2);
        System.out.println(ar1);

        ar1.addAll(2, ar2); //add ar2 from index #2
        System.out.println(ar1);

        ar1.clear();
        System.out.println(ar1);*/

        ArrayList<String> cloneList = (ArrayList<String>) ar1.clone(); //cloning the ar1 ArrayList
        System.out.println(cloneList);

        System.out.println(ar1.contains("python"));
        System.out.println(ar1.contains("c"));

        System.out.println(ar1.indexOf("ruby") > 0);

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Sakif", "Shadman","Sakif", "Arnob", "Shad", "Sakif"));
        System.out.println(list1);

        int i = list1.lastIndexOf("test"); //"test" is not available here. it won't give any error. it will just return -1.
        System.out.println(i);

        list1.remove(1);
        System.out.println(list1);

        list1.remove("Arnob");
        System.out.println(list1);

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        numbers.removeIf(num -> num%2 == 0); //prints odd numbers
        System.out.println(numbers);

        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        numbers2.removeIf(num -> num%2 == 1); //prints even numbers
        System.out.println(numbers2);

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList("Sakif", "Shadman","Shad", "Arnob", "Shadman", "Ish"));
        System.out.println(namesList);

        namesList.retainAll(Collections.singleton("Shadman"));
        System.out.println(namesList);

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));
        ArrayList<Integer> subList = new ArrayList<>(nums.subList(2,6));
        System.out.println(subList);

        ArrayList<String> newList = new ArrayList<>(Arrays.asList("Sakif", "Shadman","Shad", "Arnob", "Ish"));
        Object arr[] = newList.toArray();
        System.out.println(Arrays.toString(arr));
        for (Object o : arr) {
            System.out.println((String)o);
        }
    }
}