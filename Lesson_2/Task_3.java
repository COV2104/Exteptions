package Lesson_2;

/*Если необходимо, исправьте код:
public static void main(String[] args) throws Exception {
try {
int a = 90;
int b = 3;
System.out.println(a / b);
printSum(23, 234);
int[] abc = { 1, 2 };
abc[3] = 9;
} catch (Throwable ex) {
System.out.println("Что-то пошло не так...");
} catch (NullPointerException ex) {
System.out.println("Указатель не может указывать на null!");
} catch (IndexOutOfBoundsException ex) {
System.out.println("Массив выходит за пределы своего размера!");
}
}
public static void printSum(Integer a, Integer b) throws FileNotFoundException {
System.out.println(a + b);
} */
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {
        try {
            int a = 100;
            int b = 50;
            System.out.println(a / b);
            printSum(a, b);
            
            int[] abc = { 5, 7 };
            abc[1] = 9;
            System.out.println(Arrays.toString(abc));
        
        } catch (ArithmeticException ex) {
            System.out.println("Ошибка: деление на ноль!");
        } catch (NullPointerException ex) {
            System.out.println("Ошибка: указатель не может указывать на null!");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Ошибка: выход за пределы массива!");
        } catch (FileNotFoundException ex) {
            System.out.println("Ошибка: файл не найден!");
        } catch (Exception ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    
    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }
}
