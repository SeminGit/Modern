package Models.Person;

import java.util.List;

public class Crew {

    private String name;
    private List<CrewMember> crewMembers;

    public Crew(String name, List<CrewMember> crewMembers){
        this.name = name;
        this.crewMembers = crewMembers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CrewMember> getCrewMembers() {
        return crewMembers;
    }

    public void setCrewMembers(List<CrewMember> crewMembers) {
        this.crewMembers = crewMembers;
    }
}
