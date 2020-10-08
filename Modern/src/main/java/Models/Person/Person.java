package Models.Person;

import Contstants.Sex;

import java.util.Date;

public abstract class Person {

    private String name;
    private Date birthDate;
    private Sex sex;


    public Person(){}

    public Person(String name, Date birthDate, Sex sex){
        this.name = name;
        this.birthDate = birthDate;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
