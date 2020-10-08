package Models.Flights;

import Models.Plane.Plane;
import Models.RouteInfo.Route;
import Models.Station;

import java.sql.Time;

public abstract class Flight {

    private Integer distance;
    private Route route;
    private Plane plane;
    private Time startTime;
    private Time finishTime;

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Time finishTime) {
        this.finishTime = finishTime;
    }

    @Override
    public String toString(){
        return new String(distance.toString());
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }
}
