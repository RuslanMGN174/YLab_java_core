package ru.knyazev.lesson1.task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 6, 3, 2, 5, 1, 4, 9};
        System.out.printf("Non-sorted array: %s%n", Arrays.toString(array));

        int low = 0;
        int high = array.length - 1;

        quickSort(array, low, high);
        System.out.printf("Sorted array: %28s", Arrays.toString(array));
    }

    public static void quickSort(int[] array, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(array, begin, end);

            quickSort(array, begin, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, end);
        }
    }

    private static int partition(int[] array, int begin, int end) {
        int pivot = array[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (array[j] <= pivot) {
                i++;

                int swapTemp = array[i];
                array[i] = array[j];
                array[j] = swapTemp;
            }
        }

        int swapTemp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = swapTemp;

        return i + 1;
    }
}