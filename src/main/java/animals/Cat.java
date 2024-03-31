package animals;

public class Cat extends Animal implements HomeAnimal {
    protected String type;
    protected String name;
    protected String dateOfBirthday;

    public Cat(String name, String dateOfBirthday) {
        this.name = name;
        this.dateOfBirthday = dateOfBirthday;
        type = "Кошка";
        commands.put("Мяукай", "Мяяяяяяу");
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
