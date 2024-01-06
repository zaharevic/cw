package Animals;

public class Pet extends Animal {
    public Pet(String name, String date, String type, int id) {
        super(name, date, type, id);
    }

    @Override
    public String toString() {
        return "Pet {" +
                "id = " + super.getId() +  '\'' +
                "name = '" + super.getName() + '\'' +
                ", commands = " + super.getCommands() +
                ", dateOfBirth = '" + super.getDateOfBirth() + '\'' +
                '}';
    }
}
