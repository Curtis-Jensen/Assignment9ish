package test;

import java.util.ArrayList;

public class Assignment9POINT5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        list.remove(9);

        System.out.println("The size of the list is" + list.size());
        System.out.println("Does the list contain 1?" + list.contains(1));

        System.out.println("There are " + list.get(0) +
                " kinds of people: those who understand 0 based indexing, and those who don't.");

        System.out.println("Sublist BOI: " + list.subList(3,7));

        list.clear();
        System.out.println("Is the list clear: " + list.isEmpty());
    }
}
