package animals;

public class Hamster extends Animal implements PackAnimal {
    protected String type;
    protected String name;
    protected String dateOfBirthday;

    public Hamster(String name, String dateOfBirthday) {
        this.name = name;
        this.dateOfBirthday = dateOfBirthday;
        type = "Хомяк";
        commands.put("Бегай", "Я побежал!");
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
