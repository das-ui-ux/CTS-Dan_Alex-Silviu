package State.main;

import State.clase.Bus;
import State.clase.IBusState;

public class Main {
    public static void main(String[] args){
        Bus bus = new Bus("VL21BUN");
        bus.goInService();
        bus.arriveAtTheEndOfRoute();
        bus.arriveAtTheEndOfRoute();
        bus.leaveForRoute();
        bus.goInService();
        bus.arriveAtTheEndOfRoute();
    }
}
