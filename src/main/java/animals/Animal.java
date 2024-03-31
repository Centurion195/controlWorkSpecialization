package animals;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public abstract class Animal {
    protected String name;
    protected String dateOfBirthday;
    public abstract Map<String, String> getCommands();

    public abstract String executeCommand(String com);

    public abstract String trainCommand(String command, String action);
}
