package Animals;

public class PackAnimals extends Animal {
    public PackAnimals(String name, String date, String type, int id) {
        super(name, date, type, id);
    }

    @Override
    public String toString() {
        return "Pack Animal {" +
                "id = " + super.getId() +  '\'' +
                "name = '" + super.getName() + '\'' +
                ", commands = " + super.getCommands() +
                ", dateOfBirth = '" + super.getDateOfBirth() + '\'' +
                '}';
    }
}