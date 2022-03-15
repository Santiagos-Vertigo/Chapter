package uno.dos;

import java.util.Locale;

/** Main method */
public class TestMyLinkedList24_4 {
    // Main Method
    public static void main (String[]args){
        // Create list for strings
        MyLinkedList24_5<String> list = new MyLinkedList24_5();

        //Add element to the list
        list.add("America"); // Add to the list
        System.out.println("(1) " + list);

        list.add(0, "Canada"); // Add it to the beginning of the list
        System.out.println("(2) " + list);

        list.add("Rusia"); // Add it to the end of the list
        System.out.println("(3) " + list);

        list.addLast("France"); // Add it to the end of the list
        System.out.println("(4) " + list);

        list.add(2, "Germany"); // Add it to the end of the list at index 2
        System.out.println("(5) " + list);

        list.add(5,"Norway"); // Add it to the end of the list at index 5
        System.out.println("(6) " + list);

        list.add(0, "Poland"); // Same as list.addFirst ("Poland")
        System.out.println("(7) " + list);

        // Remove elements from the list
        list.remove(0); // Same as list.remove("Poland") in the case
        System.out.println("(8) " + list);

        list.remove(2); // Remove the element at index 2
        System.out.println("(9) " + list);

        list.remove(list.size() -1); // Remove the last element
        System.out.println("(10) " + list + "\n(11) ");

        for(String s : list)
            System.out.println(s.toUpperCase() + " ");

        list.clear();
        System.out.println("\nAfter clearing the list, the list size is " + list.size());
    }
}
