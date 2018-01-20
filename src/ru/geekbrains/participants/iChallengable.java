package ru.geekbrains.participants;

public interface iChallengable {
    void run(int distance);
    void swim(int distance);
    void jump(int height);
    void printInfo();
    boolean isOnDistance();

}
