package animals;

public class Dog extends Animal implements HomeAnimal {
    protected String type;
    protected String name;
    protected String dateOfBirthday;

    public Dog(String name, String dateOfBirthday) {
        this.name = name;
        this.dateOfBirthday = dateOfBirthday;
        type = "Собака";
        commands.put("Гавкай", "Гав! Гав!");
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
