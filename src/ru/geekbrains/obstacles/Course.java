package ru.geekbrains.obstacles;

import ru.geekbrains.participants.Team;
import ru.geekbrains.participants.iChallengable;

public class Course {

    Obstacle[] obstacles;

    public Course(Obstacle[] obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {

        iChallengable[] teamMembers = team.getTeamMembers();

        for(iChallengable member : teamMembers){

            for(Obstacle oneObstacle : obstacles){

                oneObstacle.doIt(member);
            }
        }
    }
}
