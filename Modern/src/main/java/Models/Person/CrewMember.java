package Models.Person;

import Contstants.Sex;

import java.util.Date;

public class CrewMember extends Person {

    private String rank;
    private String position;


    public CrewMember(String rank, String position){
        this.rank = rank;
        this.position = position;
    }
    public CrewMember(String name, Date birthDate, Sex sex){
        super(name,birthDate,sex);
    }

    public CrewMember(String name, Date birthDate, Sex sex,String rank, String position){
        super(name,birthDate,sex);
        this.rank = rank;
        this.position = position;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
