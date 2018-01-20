package ru.geekbrains;

import ru.geekbrains.obstacles.*;
import ru.geekbrains.participants.Cat;
import ru.geekbrains.participants.Dog;
import ru.geekbrains.participants.Team;

public class Main {

    public static void main(String[] args) {

        Team animals = new Team("Pets",
                new Cat(1000, 5, 0, "Barsik"),
                new Dog(2000, 3, 200, "Sharik"),
                new Cat(1500, 3, 100, "Tom"),
                new Dog(2500, 2, 200, "Spike"));

        Obstacle[] obstacles = {new Cross(500), new Wall(3), new Pool(100)};

        Course c = new Course(obstacles);

        c.doIt(animals);

        animals.printSuccessfulMembersInfo();

        animals.printAllMembersInfo();
    }
}
