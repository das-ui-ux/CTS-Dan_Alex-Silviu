package State.clase;

public class BusInRoute implements IBusState{
    @Override
    public void changeState(Bus bus) {
        if(bus.getState() instanceof BusAtEndOfRoute){
            System.out.println("Autobuzul " + bus.getLicensePlate() + " a plecat in noua cursa.");
            bus.setState(this);
        }else{
            System.out.println("Autobuzul " + bus.getLicensePlate() + "  nu poate pleca intr-o noua ruta");
        }
    }
}
