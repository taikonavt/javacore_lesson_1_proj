package ru.geekbrains.participants;

public class Team {

    private iChallengable[] teamMembers;
    private String name;

    public Team(String name, iChallengable firstTm, iChallengable secondTm, iChallengable thirdTm,
                iChallengable fourthTm) {

        this.name = name;

        teamMembers = new iChallengable[4];

        teamMembers[0] = firstTm;
        teamMembers[1] = secondTm;
        teamMembers[2] = thirdTm;
        teamMembers[3] = fourthTm;
    }

    public iChallengable[] getTeamMembers() {
        return teamMembers;
    }

    public void printAllMembersInfo() {

        System.out.println();

        System.out.println("Info about all members of \"" + name + "\":");

        for (iChallengable oneTm : teamMembers) {

            oneTm.printInfo();
        }
    }

    public void printSuccessfulMembersInfo() {

        System.out.println();

        System.out.println("These members of \"" + name + "\" finished the marathon:");

        for (iChallengable oneTm : teamMembers) {

            if (oneTm.isOnDistance()) {

                oneTm.printInfo();
            }
        }
    }
}
