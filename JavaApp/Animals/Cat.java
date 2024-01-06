package Animals;

public class Cat extends Pet {
    public Cat(String name, String date, String type, int id) {
        super(name, date, type, id);
    }

    @Override
    public String toString() {
        return "Cat {" +
                "id = " + super.getId() +  '\'' +
                "name = '" + super.getName() + '\'' +
                ", commands = " + super.getCommands() +
                ", dateOfBirth = '" + super.getDateOfBirth() + '\'' +
                '}';
    }
}