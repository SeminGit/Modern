package Models.Person;

import Contstants.CompanyType;
import Contstants.Sex;

import java.util.Date;

public class Passenger extends Person {

    private String passwordId;

    public Passenger(String name, Date birthDate, Sex sex){
        super(name,birthDate,sex);
    }

    public Passenger(String passwordId){
        this.passwordId = passwordId;
    }

    public String getPasswordId() {
        return passwordId;
    }

    public void setPasswordId(String passwordId) {
        this.passwordId = passwordId;
    }
}
