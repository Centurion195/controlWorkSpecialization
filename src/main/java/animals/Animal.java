package animals;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public abstract class Animal {
    protected String name;
    protected String dateOfBirthday;
    @Getter
    protected Map<String, String> commands = new HashMap<>();

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
}
