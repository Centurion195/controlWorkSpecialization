package animals;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public class Horse extends Animal implements PackAnimal {
    protected String type;
    protected String name;
    protected String dateOfBirthday;
    protected Map<String, String> commands = new HashMap<>();
    public Map<String, String> getCommands() {
        return commands;
    }

    public Horse(String name, String dateOfBirthday) {
        this.name = name;
        this.dateOfBirthday = dateOfBirthday;
        type = "Лошадь";
        commands.put("Стоять", "А я и так стою");
    }

    public String executeCommand(String com) {
        return commands.getOrDefault(com, "=> Я этого не умею!");
    }

    public String trainCommand(String command, String action) {
        if (!commands.containsKey(command)) {
            commands.put(command, action);
            return "=> Я запомнил!";
        } else {
            return "=> Я это уже умею!";
        }
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", Дата рождения: " + dateOfBirthday + ", Вид: " + type + "\n";
    }
}
