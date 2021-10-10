package com.company;

import java.util.Scanner;

public class Main {

    public static Countries countries = new Countries();

    //
    public static void main(String[] args) {

        countries.add(new Country("Ukraine", "Kiev", "Eurasia", 41723998, 603549));
        countries.add(new Country("Russia", "Moscow", "Eurasia", 146171015, 17125191));
        countries.add(new Country("Egypt", " Cairo", "Africa", 210000000, 923768));
        countries.add(new Country("Nigeria", "Abuja", "Africa", 102333440, 1001450));
        countries.add(new Country("Fiji", "Dry", "Australia", 935974, 18274));

        menu();
    }

    public static void menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1)Вывод информации о странах" +
                "\n2)Поиск по названию столицы" +
                "\n3)Поиск по занимаемой площади" +
                "\n4)Удаление записи у которой численисть меньше заданой" +
                "\n5)Сортировка по названию страны" +
                "\n6)Выход");
        System.out.print("Выберете пункт меню:");
        int menuNumber = scan.nextInt();
        scan.nextLine();
        while (true) {
            if (menuNumber < 0 || menuNumber > 6) {
                System.out.print("Выберете СУЩЕСТВУЮЩИЙ пункт меню: ");
                menuNumber = scan.nextInt();
            } else {
                break;
            }
        }
        switch (menuNumber) {
            case 1:
                System.out.println(countries);
                menu();
                break;
            case 2:
                System.out.println("Введите название столицы:");
                String capital = scan.nextLine();
                countries.searchCapital(capital);
                break;
            case 3:
                System.out.println("Введите значение площади которое хотите найти:");
                int area = scan.nextInt();
                countries.searchArea(area);
                break;
            case 4:
                System.out.println("Введите численость которую хотите удалить:");
                int countPopulation = scan.nextInt();
                countries.removePopulation(countPopulation);
            case 5:
                countries.sorting();
                System.out.println(countries);
                break;
            case 6:
                break;
        }


    }


}





















