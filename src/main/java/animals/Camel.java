package animals;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public class Camel extends Animal implements PackAnimal {
    protected String type;
    protected String name;
    protected String dateOfBirthday;
    @Getter
    protected Map<String, String> commands;

    public Camel(String name, String dateOfBirthday) {
        this.name = name;
        this.dateOfBirthday = dateOfBirthday;
        type = "Верблюд";
        commands = new HashMap<>();
        commands.put("Плюйся", "Плююсь!");
    }

    public String executeCommand(String com) {
        return super.executeCommand(com);
    }

    public String trainCommand(String command, String action) {
        return super.trainCommand(command, action);
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", Дата рождения: " + dateOfBirthday + ", Вид: " + type + "\n";
    }
}
