package ru.knyazev.lesson2.task3;

public class Main {
    public static void main(String[] args) {
    }

    public static boolean fuzzySearch(String searchString, String text) {
        if (isEmptyOrNull(searchString, text)) return false;

        int index;
        char[] searchStringArray = searchString.toCharArray();

        for (char c : searchStringArray) {
            if (text.indexOf(c) < 0) return false;
            index = text.indexOf(c);
            text = text.substring(index + 1);
        }
        return true;
    }

    private static boolean isEmptyOrNull(String searchString, String text) {
        return searchString == null || text == null || searchString.isEmpty() || text.isEmpty();
    }
}
