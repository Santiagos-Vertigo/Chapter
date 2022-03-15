package uno.dos;

public class TestMyArray24_3 {
    public static void main(String[]args){
        // Create a list
        MyList24_1<String> list = new MyArrayList24_2();

        // Add Element to the list
        list.add("America"); // Add it to the list
        System.out.println("(1) " + list);

        list.add(0, "Canada"); // Add it to the begining of the list
        System.out.println("(2) " + list);

        list.add("Russia"); // Add it to the end of the list
        System.out.println("(3) " + list);

        list.add("France"); // Add it to the end of the list
        System.out.println("(4) " + list);

        list.add(2, "Germany"); // Add it to the list at index 2
        System.out.println("(5) " + list);

        list.add(5, "Norway"); // Add it to the list at index 2
        System.out.println("(6) " + list);

        list.remove("Canada"); // Same as list.remove() in this case
        System.out.println("(7) " + list);

        list.remove(2); // Remove the element at index 2
        System.out.println("(8) " + list);

        list.remove(list.size() - 1); // Remove the last element
        System.out.println("(9) " + list + "\n(10) ");
        for (String s: list)
            System.out.print(s.toUpperCase() + " ");
    }
}
