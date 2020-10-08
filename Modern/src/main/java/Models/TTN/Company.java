package Models.TTN;

import Contstants.CompanyType;

import java.util.concurrent.ConcurrentMap;

public class Company {

    private String name;
    private CompanyType companyType;

    public Company(String name, CompanyType companyType){
        this.name = name;
        this.companyType = companyType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CompanyType getCompanyType() {
        return companyType;
    }

    public void setCompanyType(CompanyType companyType) {
        this.companyType = companyType;
    }
}
