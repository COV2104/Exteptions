package Lesson_1;

/**
 * Methods
 */
public class Methods {

    // Метод, генерирующий исключение IndexOutOfBoundsException:
    public void method1() {
        int[] arr = { 1, 2, 3 };
        System.out.println(arr[3]);
    }

    // Метод, генерирующий исключение NullPointerException:

    public void method2() {
        String str = null;
        System.out.println(str.length());
    }

    // Метод, генерирующий исключение ArithmeticException:

    public void method3() {
        int a = 5;
        int b = 0;
        System.out.println(a / b);
    }
}
