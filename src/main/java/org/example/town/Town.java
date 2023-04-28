package org.example.town;


public class Town {

    public Town() {
    }

    public int howManyCanVote(Citizen[] citizens) {
        int voterCount = 0;
        for (Citizen citizen : citizens) {
            if (citizen.canVote()) {
                voterCount++;
            }
        }
        return voterCount;
    }

    public String whoCanVote(Citizen[] citizens) {
        StringBuilder votersNames = new StringBuilder("Voters that can vote:");
        StringBuilder nonVotersNames = new StringBuilder("\n\nNon voters:");
        for (Citizen citizen : citizens) {
            if (citizen.canVote()) {
                votersNames.append("\n").append(citizen.name);
            }
//             else {
//                nonVotersNames.append("\n").append(citizen.name);
//            }
        }
        return votersNames.toString();
                //+ nonVotersNames.toString();
    }
}
