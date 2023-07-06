import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserDataApplication {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("1 - Записать данные в файл");
            System.out.println("2 - Прочитать данные из файла");
            System.out.println("Выберите действие:");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                writeUserData(scanner);
            } else if (choice == 2) {
                readUserData(scanner);
            } else {
                System.out.println("Неверный выбор");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void writeUserData(Scanner scanner) throws IOException {
        System.out.println("Введите данные (фамилия имя отчество дата_рождения номер_телефона пол):");
        String input = scanner.nextLine();

        String[] data = input.split(" ");
        if (data.length != 6) {
            throw new IllegalArgumentException("Введите все данные: фамилия имя отчество дата_рождения номер_телефона пол");
        }

        String surname = data[0];
        String name = data[1];
        String patronymic = data[2];
        String birthDate = data[3];
        String phoneNumber = data[4];
        String gender = data[5];

        validateBirthDate(birthDate);
        validatePhoneNumber(phoneNumber);
        validateGender(gender);

        String fileName = surname + ".txt";
        String userData = surname + " " + name + " " + patronymic + " " + birthDate + " " + phoneNumber + " " + gender;

        FileWriter fileWriter = new FileWriter(fileName, true);
        fileWriter.write(userData + "\n");
        fileWriter.close();

        System.out.println("Данные записаны успешно в файл " + fileName);
    }

    private static void readUserData(Scanner scanner) throws IOException {
        System.out.println("Введите фамилию, чтобы прочитать данные:");
        String surname = scanner.nextLine();
        String fileName = surname + ".txt";

        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();
    }

    private static void validateBirthDate(String birthDate) {
        if (!birthDate.matches("\\d{2}.\\d{2}.\\d{4}")) {
            throw new IllegalArgumentException("Неверный формат даты рождения. Используйте формат dd.mm.yyyy");
        }
    }

    private static void validatePhoneNumber(String phoneNumber) {
        if (!phoneNumber.matches("\\d{7}")) {
            throw new IllegalArgumentException("Неверный формат номера телефона. Введите 7-значное число");
        }
    }

    private static void validateGender(String gender) {
        if (!gender.equals("f") && !gender.equals("m")) {
            throw new IllegalArgumentException("Неверный формат пола. Введите f для женского и m для мужского");
        }
    }
}