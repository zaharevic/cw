package Animals;

public class Dog extends Pet{
    public Dog(String name, String date, String type, int id) {
        super(name, date, type, id);
    }

    @Override
    public String toString() {
        return "Dog {" +
                "id = " + super.getId() +  '\'' +
                "name = '" + super.getName() + '\'' +
                ", commands = " + super.getCommands() +
                ", dateOfBirth = '" + super.getDateOfBirth() + '\'' +
                '}';
    }
}
