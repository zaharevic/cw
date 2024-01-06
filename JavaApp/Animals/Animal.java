package Animals;

import java.util.ArrayList;

public class Animal {
    private String name;
    private ArrayList commands = new ArrayList<String>();
    private String dateOfBirth;
    int id = 0;
    String type = null;

    public Animal(String name, String date, String type, int id){
        this.id = id;
        this.type = type;
        setName(name);
        setDateOfBirth(date);
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getCommands() {
        return commands.toString();
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setCommands(ArrayList commands) {
        this.commands = commands;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void setCommands(String commands) {
        this.commands.add(commands);
    }

    private void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Animal{" +
                ", id=" + id +
                ", type='" + type + '\'' +
                "name='" + name + '\'' +
                ", commands=" + commands +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}