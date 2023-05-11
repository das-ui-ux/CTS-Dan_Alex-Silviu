package State.clase;

public class BusInService implements IBusState{
    @Override
    public void changeState(Bus bus) {
        if(bus.getState() instanceof BusAtEndOfRoute){
            System.out.println("Autobuzul " + bus.getLicensePlate() + " se afla in service.");
            bus.setState(this);
        }else{
            System.out.println("Autobuzul " + bus.getLicensePlate() + " nu poate pleca intr-o noua ruta.");
        }
    }
}
