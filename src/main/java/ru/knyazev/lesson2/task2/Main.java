package ru.knyazev.lesson2.task2;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{3, 4, 2, 7};

        System.out.println(twoElementsOfArrayInTarget(array, 10));
    }

    public static @NotNull String twoElementsOfArrayInTarget(int[] arr, int target) {
        int firstValue;
        int secondValue;
        int index;

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            firstValue = arr[i];
            secondValue = target - firstValue;
            index = Arrays.binarySearch(arr, i, arr.length, secondValue);

            if (index > 0 && arr[i] + arr[index] == target) {
                return Arrays.toString(new int[]{arr[i], arr[index]});
            }
        }
        return "В массиве нет пары с суммой " + target;
    }
}