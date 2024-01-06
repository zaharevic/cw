package Animals;

import java.util.ArrayList;

public class Service {
    private ArrayList<Animal> animals;
    Counter counter = new Counter();

    public Service(){
        animals = new ArrayList<>();
    }

    public void addAimal(String name, String date, String type){
        counter.add();
        switch (type){
            case ("DOG"):
                Dog dog = new Dog(name, date, "DOG", getAnimalsListSize());
                animals.add(dog);
                break;
            case ("CAT"):
                Cat cat = new Cat(name, date, "CAT", getAnimalsListSize());
                animals.add(cat);
                break;
            case ("HAMSTER"):
                Hamster hamster = new Hamster(name, date, "HAMSTER", getAnimalsListSize());
                animals.add(hamster);
                break;
            case ("HORSE"):
                Horse horse = new Horse(name, date, "HORSE", getAnimalsListSize());
                animals.add(horse);
                break;
            case ("CAMEL"):
                Camel camel = new Camel(name, date, "CAMEL", getAnimalsListSize());
                animals.add(camel);
                break;
            case ("DONKEY"):
                Donkey donkey = new Donkey(name, date, "DONKEY", getAnimalsListSize());
                animals.add(donkey);
                break;
        }
    }

    public void printAnimalsList(){
        StringBuilder sb = new StringBuilder();
        sb.append("In Animal list: ");
        sb.append(animals.size());
        sb.append(" objects: \n");
        for (Animal animal: animals){
            sb.append(animal);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    public int getAnimalsListSize(){
        return animals.size();
    }

    public Animal getById(int id){
        for(int i = 0; i < animals.size(); i++){
            if(animals.get(i).getId() == id){
                return animals.get(i);
            }
        }
        return null;
    }

    public void addCommand(int id, String command){
        Animal animal = getById(id);
        animal.setCommands(command);
    }
}
