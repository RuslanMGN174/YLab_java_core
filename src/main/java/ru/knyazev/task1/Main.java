package ru.knyazev.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = randomValue();
            }
            System.out.println(Arrays.toString(array[i]));
        }
        printThreeValuesOfArray(array);
    }

    public static int randomValue() {
        return (int) ((System.nanoTime() * 0x5DEECE66DL + 0xBL) & ((1L << 48) - 1)) % 100;
    }

    private static void printThreeValuesOfArray(int[][] array) {
        int maxNumber = array[0][0];
        int minNumber = array[0][0];
        int count = 0;
        double sum = 0;

        try {
            for (int[] ints : array) {
                for (int anInt : ints) {
                    sum += anInt;
                    count++;
                    if (maxNumber <= anInt) maxNumber = anInt;
                    if (anInt < minNumber) minNumber = anInt;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        double avg = sum / count;

        System.out.printf("Максимальное значение массива: %d%n", maxNumber);
        System.out.printf("Минимальное значение массива: %d%n", minNumber);
        System.out.printf("Среднее значение массива: %.2f%n", avg);
    }
}