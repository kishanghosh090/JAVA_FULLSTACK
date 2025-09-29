package collectionFramework;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> a1 = new LinkedList<>();
        a1.add("kishan");
        a1.add("Rana");
        a1.add("ghosh");
        a1.add("IITM");
        a1.addFirst("add to first");
        a1.addLast("add to last");
        a1.remove("kishan");
        for (String i : a1) {
            System.out.println(i);
        }

        Vector<String> v = new Vector<String>();// vector is thread safe
        v.add("kishan");
        v.add("Rana");
        v.add("ghosh");
        v.add("IITM");
//        v.addFirst("add to first");
//        v.addLast("add to last");
        for (String i : v) {
            System.out.println(i);
        }
        HashSet<String> hs = new HashSet<>();
        hs.add("elychy");
        hs.add("ginger");
        hs.add("earl gray");

        boolean isContain = hs.contains("elychy");
        System.out.println(isContain);
        Hashtable<String, Integer> ht = new Hashtable<>();

        // Adding elements to the Hashtable
        ht.put("One ", 1);
        ht.put("Two ", 2);
        ht.put("Three ", 3);

        // Displaying the Hashtable elements
        System.out.println("Hashtable Elements: " + ht);
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        for (Integer i : set) {
            System.out.println(i);
        }




    }
}
