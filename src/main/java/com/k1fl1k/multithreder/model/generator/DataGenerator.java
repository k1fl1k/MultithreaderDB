package com.k1fl1k.multithreder.model.generator;

import com.github.javafaker.Faker;
import com.k1fl1k.multithreder.model.entities.Worker;
import java.util.ArrayList;
import java.util.List;

public class DataGenerator {

    private static final Faker faker = new Faker();
    private static final String[] educationLevels = {"High School", "Bachelor's Degree", "Master's Degree", "PhD"};

    public static List<Worker> generateWorkers(int count) {
        List<Worker> workers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int randomIndex = faker.random().nextInt(educationLevels.length);
            String education = educationLevels[randomIndex];

            workers.add(new Worker(
                i,
                faker.name().firstName(),
                faker.name().lastName(),
                faker.random().nextInt(65),
                faker.random().nextBoolean() ? "Male" : "Female",
                education,
                faker.random().nextInt(30),
                faker.random().nextInt(100000),
                faker.random().nextInt(2000)
            ));
        }
        return workers;
    }
}
