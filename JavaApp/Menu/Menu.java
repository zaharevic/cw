package Menu;

import Animals.Dog;
import Animals.Service;

import java.util.Scanner;

public class Menu {
    Scanner scanner;
    Service service;

    public Menu(){
        service = new Service();
        boolean menuFlag = true;
        scanner = new Scanner(System.in);

        while (menuFlag){
            String action;
            System.out.println("1.Добавить животное\n2.Посмотреть список животных\n3.Обучить животное новым командам\n\n0.Выход");
            System.out.println("Выберите действие:");
            action = scanner.nextLine();
            switch (action){
                case ("1"):
                    addAnimal();
                    break;
                case ("2"):
                    printAnimalsList();
                    break;
                case ("3"):
                    addCommand();
                    break;
                case ("0"):
                    menuFlag = false;
                    break;
                default:
                    System.out.println("Error! Incorrect value!");
                    break;
            }
        }
    }

    private void addAnimal(){
        String name;
        boolean typeFlag = true;
        String type1;
        String type = null;
        String sDay = null;
        String sMonth = null;
        String sYear = null;
        boolean yearFalg = true;
        boolean monthFlag = true;
        boolean dayFlag = true;

        System.out.println("Введите имя животного: ");
        name = scanner.nextLine();

        while (typeFlag) {
            System.out.println("1.Собака\n2.Кот\n3.Хомяк\n4.Лошадь\n5.Верблюд\n6.Осел\nВведите тип животного:");
            type1 = scanner.nextLine();
            switch (type1){
                case ("1"):
                    type = "DOG";
                    typeFlag = false;
                    break;
                case ("2"):
                    type = "CAT";
                    typeFlag = false;
                    break;
                case ("3"):
                    type = "HAMSTER";
                    typeFlag = false;
                    break;
                case ("4"):
                    type = "HORSE";
                    typeFlag = false;
                    break;
                case ("5"):
                    type = "CAMEL";
                    typeFlag = false;
                    break;
                case ("6"):
                    type = "DONKEY";
                    typeFlag = false;
                    break;
                default:
                    System.out.println("Error! Incorrect value!");
                    break;
            }
        }

        while (yearFalg) {
            System.out.println("Введите год рождения животного: ");
            sYear = scanner.nextLine();
            int year = Integer.parseInt(sYear);
            if(year < 2025 && year > 1900){
                yearFalg = false;
            }
            else {
                System.out.println("Error! Incorrect value!");
            }
        }
        while (monthFlag){
            System.out.println("Введите месяц рождения: ");
            sMonth = scanner.nextLine();
            int month = Integer.parseInt(sMonth);
            if(month > 0 && month < 13){
                monthFlag = false;
            }
            else {
                System.out.println("Error! Incorrect value!");
            }
        }
        while (dayFlag){
            System.out.println("Введите день рождения: ");
            sDay = scanner.nextLine();
            int day = Integer.parseInt(sDay);
            if(day > 0 && day < 32){
                dayFlag = false;
            }
            else {
                System.out.println("Error! Incorrect value!");
            }
        }
        String date = sDay + "-" + sMonth + "-" + sYear;

        service.addAimal(name,date,type);
    }

    private void printAnimalsList(){
        service.printAnimalsList();
    }

    private void addCommand(){
        String sID = null;
        String commandName = null;
        int id = -1;
        boolean idFlag = true;

        while (idFlag) {
            printAnimalsList();
            System.out.println("Введите id животного: ");
            sID = scanner.nextLine();
            id = Integer.parseInt(sID);
            if(id > -1 && id < service.getAnimalsListSize() - 1){
                idFlag = false;
            }
            else{
                System.out.println("Error! Incorrect value!");
            }
        }

        System.out.println("Введите название команды: ");
        commandName = scanner.nextLine();
        service.addCommand(id, commandName);
    }
}
