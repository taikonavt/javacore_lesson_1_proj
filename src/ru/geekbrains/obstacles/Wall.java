package ru.geekbrains.obstacles;

import ru.geekbrains.participants.iChallengable;

public class Wall extends Obstacle{

    int height;

    public Wall(int height){
        this.height = height;
    }

    @Override
    public void doIt(iChallengable a){
        a.jump(this.height);
    }
}
