package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Countries {
    ArrayList<Country> countries;

    public Countries() {
        this.countries = new ArrayList<>();
    }

    void add(Country country) {
        countries.add(country);
    }


    void removePopulation(int countPopulation) {
        for (Country object : countries) {
            if (object.getPopulation() < countPopulation) {
                countries.remove(object);
                break;
            }
        }
        Main.menu();
    }

    void searchCapital(String capital) {
        for (Country object : countries) {
            if (object.getCapital().equals(capital)) {
                System.out.println(object);
            }
        }
        Main.menu();
    }

    void searchArea(int area) {
        for (Country object : countries) {
            if (object.getArea() == area) {
                System.out.println(object);
            }
        }
        Main.menu();
    }

    void sorting() {
        Collections.sort(countries, new CompatorInt());
        Main.menu();
    }

    @Override
    public String toString() {
        return "Countries{" +
                "countries=\n" + countries +
                '}';
    }


}
