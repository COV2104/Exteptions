package Lesson_2;

/* Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к 
падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.*/

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        float number = getFloatInput();
        System.out.println("Введенное число: " + number);
    }

    public static float getFloatInput() {
        Scanner scanner = new Scanner(System.in);
        float number = 0;
        boolean isValid = false;
        
        while (!isValid) {
            System.out.print("Введите дробное число: ");
            try {
                number = Float.parseFloat(scanner.nextLine());
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Введенное значение не является десятичным числом, попробуйте снова.");
            }
        }
        
        return number;
    } 
    
}
