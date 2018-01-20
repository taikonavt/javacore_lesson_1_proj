package ru.geekbrains.obstacles;

import ru.geekbrains.participants.iChallengable;

public class Cross extends Obstacle{
    int length;
    public Cross(int length){
        this.length = length;
    }
    @Override
    public void doIt(iChallengable a){
        a.run(this.length);
    }
}
