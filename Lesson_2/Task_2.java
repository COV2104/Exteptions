package Lesson_2;

/*
Если необходимо, исправьте код:
try {
int d = 0;
double catchedRes1 = intArray[8] / d;
System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
System.out.println("Catching exception: " + e);
}
 */

public class Task_2 {
    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // объявляем и заполняем массив
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка арифметической операции: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Ошибка: выход за пределы массива!");
        }
    }
}
