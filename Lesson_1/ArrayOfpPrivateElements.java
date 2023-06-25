package Lesson_1;

import java.util.Arrays;

public class ArrayOfpPrivateElements {
    public static void main(String[] args) {
        int[] arr1 = { 10, 20, 30 };
        int[] arr2 = { 5, 1, 15 };
        try {
            int[] result = divisionArrays(arr1, arr2);
            System.out.println(Arrays.toString(result));
        } catch (RuntimeException e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }

    public static int[] divisionArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("Деление на ноль");
            }
            result[i] = arr1[i] / arr2[i];
        }
        return result;
    }
}
