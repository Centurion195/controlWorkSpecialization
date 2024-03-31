import animals.*;

import java.util.List;
import java.util.Scanner;

public class Action {
    private Scanner scanner;

    public Action() {
        scanner = new Scanner(System.in);
    }

    public void addAnimal() {
        Animal animal = null;
        byte type = 0;
        String name = null;
        String dateOfBirthday = null;

        System.out.println("\nВведите имя животного:");
        name = scanner.nextLine();

        System.out.println("Введите дату рождения животного (YYYY.MM.DD):");
        dateOfBirthday = scanner.nextLine();

        do {
            System.out.println("Выберите вид животного:");
            System.out.println("1. Собака");
            System.out.println("2. Кошка");
            System.out.println("3. Хомяк");
            System.out.println("4. Лошадь");
            System.out.println("5. Осел");
            System.out.println("6. Верблюд");

            System.out.print("Выберите пункт: ");
            String command = scanner.nextLine();

            switch (command) {
                case "1" -> animal = new Dog(name, dateOfBirthday);
                case "2" -> animal = new Cat(name, dateOfBirthday);
                case "3" -> animal = new Hamster(name, dateOfBirthday);
                case "4" -> animal = new Horse(name, dateOfBirthday);
                case "5" -> animal = new Donkey(name, dateOfBirthday);
                case "6" -> animal = new Camel(name, dateOfBirthday);
                default -> System.out.println("Вид не найден. Повторите попытку!");
            }
        } while (animal == null);

        Repository.getAnimals().add(animal);
        Counter.add();
        System.out.println("=> Животное добавлено!\n");
    }

    public void viewAnimals() {
        int num = -1;
        List<Animal> animals = Repository.getAnimals();

        if (Repository.getAnimals().size() == 0) {
            System.out.println("=> Нет животных!\n");
            return;
        } else {
            for (int i = 0; i < animals.size(); i++) {
                System.out.printf("%s. %s", i + 1, animals.get(i));
            }
        }

        while (true) {
            System.out.println("\nВыберите животное:");

            System.out.print("Выберите пункт: ");
            num = scanner.nextInt();

            if (num > 0 && num - 1 > Repository.getAnimals().size()) {
                System.out.println("Не найден пункт! Повторите попытку!");
            } else {
                break;
            }
        }

        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Посмотреть все команды");
            System.out.println("2. Выполнить команду");
            System.out.println("3. Обучить новой команде");
            System.out.println("4. Назад");

            System.out.print("Выберите пункт: ");
            int num2 = scanner.nextInt();

            switch (num2) {
                case 1 -> System.out.println(Repository.getAnimals().get(num - 1).getCommands());
                case 2 -> executeCommand(num);
                case 3 -> trainCommand(num);
                case 4 -> {
                    return;
                }
                default -> System.out.println("Не найден пункт! Повторите попытку!");
            }
        }
    }

    public void executeCommand(int num) {
        Scanner  scanner2 = new Scanner(System.in);
        String command = null;

        System.out.print("Введите команду: ");
        command = scanner2.nextLine();

        System.out.println("=> " + Repository.getAnimals().get(num - 1).executeCommand(command));
    }

    public void trainCommand(int num) {
        Scanner  scanner1 = new Scanner(System.in);
        String command = null;
        String action = null;

        System.out.print("Введите команду: ");
        command = scanner1.nextLine();
        System.out.print("Введите действие: ");
        action = scanner1.nextLine();

        System.out.println(Repository.getAnimals().get(num - 1).trainCommand(command, action));
    }
}
