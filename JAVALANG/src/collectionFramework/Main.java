package collectionFramework;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;


public class Main {
    public static void main(String[] args) {
//        LinkedList<String> a1 = new LinkedList<>();
//        a1.add("kishan");
//        a1.add("Rana");
//        a1.add("ghosh");
//        a1.add("IITM");
//        a1.addFirst("add to first");
//        a1.addLast("add to last");
//        for (String i : a1) {
//            System.out.println(i);
//        }
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



    }
}
