package State.clase;

public class Bus {
    private IBusState state;
    private String licensePlate;

    public Bus(String licensePlate) {
        this.licensePlate = licensePlate;
        this.state = new BusAtEndOfRoute();
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public IBusState getState() {
        return state;
    }

    public void setState(IBusState state) {
        this.state = state;
    }

    public void leaveForRoute(){
        IBusState route = new BusInRoute();
        route.changeState(this);
    }

    public void goInService(){
        IBusState service = new BusInService();
        service.changeState(this);
    }

    public void arriveAtTheEndOfRoute(){
        IBusState end = new BusAtEndOfRoute();
        end.changeState(this);
    }
}
