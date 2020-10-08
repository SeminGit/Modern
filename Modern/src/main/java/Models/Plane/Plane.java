package Models.Plane;

import java.util.Map;

public class Plane {

    private String taleNumber;
    private String model;
    private Map<String, Integer> requiredCrew;

    public String getTaleNumber() {
        return taleNumber;
    }

    public void setTaleNumber(String taleNumber) {
        this.taleNumber = taleNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Map<String, Integer> getRequiredCrew() {
        return requiredCrew;
    }

    public void setRequiredCrew(Map<String, Integer> requiredCrew) {
        this.requiredCrew = requiredCrew;
    }
}
