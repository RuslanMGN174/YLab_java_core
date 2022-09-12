package ru.knyazev.lesson2.task2;

import lombok.NonNull;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{5, 4, 2, 7};
        System.out.println(twoElementsOfArrayInTarget(array, 10));
    }

    public static @NonNull String twoElementsOfArrayInTarget(int[] arr, int target) {
        if (arr == null) return "array is null";

        int secondValue;
        int index;

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            secondValue = target - arr[i];
            index = Arrays.binarySearch(arr, i + 1, arr.length, secondValue);
            if (index > 0) return Arrays.toString(new int[]{arr[i], arr[index]});
        }
        return "There are no elements with sum " + target;
    }
}