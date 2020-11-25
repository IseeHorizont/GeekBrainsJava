package obstacles;

import participants.Competitor;
import participants.Team;

public class Course {

    Obstacle[] obstacles;

    public Course(Obstacle[] obstacles){
        this.obstacles = obstacles;
    }

    public void doIt(Team team){
        Competitor[] teamMembers = team.getMembers();
        if(teamMembers.length > 0){
            for (Competitor comp: teamMembers){
                for (Obstacle o: obstacles){
                    o.doIt(comp);
                    if (!comp.isOnDistance()) break;
                }
            }
        } else {
            System.out.println("В команде нет участников!");
        }
    }
}
