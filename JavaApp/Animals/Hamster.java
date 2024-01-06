package Animals;

public class Hamster extends Pet{
    public Hamster(String name, String date, String type, int id) {
        super(name, date, type, id);
    }

    @Override
    public String toString() {
        return "Hamster {" +
                "id = " + super.getId() +  '\'' +
                "name = '" + super.getName() + '\'' +
                ", commands = " + super.getCommands() +
                ", dateOfBirth = '" + super.getDateOfBirth() + '\'' +
                '}';
    }
}