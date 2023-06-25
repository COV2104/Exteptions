package Lesson_1;

import java.util.Arrays;

public class DifferenceArrayOfElements {
    public static void main(String[] args) {
        int[] arr1 = { 7, 9, 1, 3, 10, 13 };
        int[] arr2 = { 10, 4, 6, 7, 10, 5 };
        try {
            int[] result = subtractionArrays(arr1, arr2);
            System.out.println(Arrays.toString(result));
        } catch (IllegalArgumentException e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }

    public static int[] subtractionArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new IllegalArgumentException("Длины массивов не равны");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }
}
