package ru.geekbrains.obstacles;

import ru.geekbrains.participants.iChallengable;

public class Pool extends Obstacle{

    int length;

    public Pool(int length){
        this.length = length;
    }

    @Override
    public void doIt(iChallengable a){
        a.swim(this.length);
    }

}
