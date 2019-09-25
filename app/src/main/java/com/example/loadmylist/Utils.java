package com.example.loadmylist;

import com.example.loadmylist.model.Animal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class Utils {

    public static List<Animal> getAnimalsList() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Clifford", "Dog", 4, true, getRandomDate()));
        animals.add(new Animal("Skipper", "Dog", 4, true, getRandomDate()));
        animals.add(new Animal("Hobo", "Dog", 4, true, getRandomDate()));
        animals.add(new Animal("Blue", "Cat", 4, true, getRandomDate()));
        animals.add(new Animal("George", "Parrot", 2, false, getRandomDate()));
        animals.add(new Animal("Stevo", "Hippo", 4, true, getRandomDate()));
        animals.add(new Animal("Moose", "Cat", 4, true, getRandomDate()));
        animals.add(new Animal("Zozo", "Bird", 2, true, getRandomDate()));
        animals.add(new Animal("Mikey", "Lion", 4, true, getRandomDate()));
        animals.add(new Animal("Health", "Pig", 4, true, getRandomDate()));
        animals.add(new Animal("Josh", "Dog", 4, true, getRandomDate()));
        animals.add(new Animal("Grant", "Dog", 4, true, getRandomDate()));
        animals.add(new Animal("Missy", "Cat", 4, true, getRandomDate()));
        animals.add(new Animal("Brian", "Cat", 4, true, getRandomDate()));
        animals.add(new Animal("Wesley", "Parrot", 2, true, getRandomDate()));
        animals.add(new Animal("Andy", "Dog", 4, true, getRandomDate()));
        animals.add(new Animal("Owan", "Cat", 4, true, getRandomDate()));
        animals.add(new Animal("Dilly", "Cat", 4, true, getRandomDate()));
        animals.add(new Animal("Jack", "Dog", 4, true, getRandomDate()));
        animals.add(new Animal("Brian#2", "Horse", 4, true, getRandomDate()));
        animals.add(new Animal("Leon", "Bird", 2, true, getRandomDate()));
        animals.add(new Animal("Hosa", "Cat", 4, true, getRandomDate()));
        animals.add(new Animal("Happy", "Dog", 4, true, getRandomDate()));
        animals.add(new Animal("MeTwo", "Dog", 4, true, getRandomDate()));
        return animals;
    }

    private static Date getRandomDate() {
        int day = new Random().nextInt((31 - 1) + 1) + 1;
        int month = new Random().nextInt((12 - 1) + 1) + 1;
        int year = new Random().nextInt((2019 - 1900) + 1) + 1900;
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
        try {
            date = sdf.parse(day + "/" + month + "/" + year);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
