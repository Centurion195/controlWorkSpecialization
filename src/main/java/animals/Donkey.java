package animals;

public class Donkey extends Animal implements PackAnimal {
    protected String type;
    protected String name;
    protected String dateOfBirthday;

    public Donkey(String name, String dateOfBirthday) {
        this.name = name;
        this.dateOfBirthday = dateOfBirthday;
        type = "Осел";
        commands.put("Голос", "Иаааааа");
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
