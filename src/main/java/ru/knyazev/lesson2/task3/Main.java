package ru.knyazev.lesson2.task3;

public class Main {
    public static void main(String[] args) {
        System.out.println(fuzzySearch("car", "ca6$$#_rtwheel")); // true
        System.out.println(fuzzySearch("cwhl", "cartwheel")); // true
        System.out.println(fuzzySearch("cwhee", "cartwheel")); // true
        System.out.println(fuzzySearch("cartwheel", "cartwheel")); // true
        System.out.println(fuzzySearch("cwheeel", "cartwheel")); // false
        System.out.println(fuzzySearch("lw", "cartwheel")); // false
    }

    public static boolean fuzzySearch(String searchString, String text) {
        int index;
        char[] searchStringArray = searchString.toCharArray();

        for (char c : searchStringArray) {
            if (text.indexOf(c) < 0) return false;
            index = text.indexOf(c);
            text = text.substring(index + 1);
        }
        return true;
    }
}
