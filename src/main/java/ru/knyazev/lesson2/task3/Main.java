package ru.knyazev.lesson2.task3;

import java.util.Arrays;
import java.util.stream.Collectors;

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

    public static boolean fuzzySearch2(String s1, String s2) {
        String similar = "";
        if ((s1 != null) & (s2 != null)) {
            similar = Arrays.stream(s2.split(""))
                    .filter(s1::contains)
                    .collect(Collectors.joining());
        }
        return similar.equals(s1);
    }

    private static boolean isEmptyOrNull(String searchString, String text) {
        return searchString == null || text == null || searchString.isEmpty() || text.isEmpty();
    }
}
