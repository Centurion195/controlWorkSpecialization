import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Action action = new Action();

        System.out.println("Реестр домашних животных");

        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("0. Выход");
            System.out.println("1. Завести новое животное");
            System.out.println("2. Показать список животных");

            System.out.print("Выберите пункт: ");
            String command = scanner.nextLine();

            if (command.equals("0")) {
                System.out.println("Программа завершена!");
                break;
            } else if (command.equals("1")) {
                action.addAnimal();
            } else if (command.equals("2")) {
                action.viewAnimals();
            } else {
                System.out.println("Команда не найдена. Повторите попытку!");
            }
        }

    }
}
