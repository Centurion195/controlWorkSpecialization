package animals;

public class Horse extends Animal implements PackAnimal {
    protected String type;
    protected String name;
    protected String dateOfBirthday;

    public Horse(String name, String dateOfBirthday) {
        this.name = name;
        this.dateOfBirthday = dateOfBirthday;
        type = "Лошадь";
        commands.put("Стоять", "А я и так стою");
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
