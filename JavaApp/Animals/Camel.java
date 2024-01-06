package Animals;

public class Camel extends PackAnimals{
    public Camel(String name, String date,String type, int id) {
        super(name, date, type, id);
    }

    @Override
    public String toString() {
        return "Camel {" +
                "id = " + super.getId() +  '\'' +
                "name = '" + super.getName() + '\'' +
                ", commands = " + super.getCommands() +
                ", dateOfBirth = '" + super.getDateOfBirth() + '\'' +
                '}';
    }
}
