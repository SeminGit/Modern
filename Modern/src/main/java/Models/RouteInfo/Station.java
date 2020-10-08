package Models.RouteInfo;

public class Station {

    private String name;
    private double oX;
    private double oY;

    public Station(String name, double oX, double oY) {
        this.name = name;
        this.oX = oX;
        this.oY = oY;
    }

    public double getoX() {
        return oX;
    }

    public void setoX(double oX) {
        this.oX = oX;
    }

    public double getoY() {
        return oY;
    }

    public void setoY(double oY) {
        this.oY = oY;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
