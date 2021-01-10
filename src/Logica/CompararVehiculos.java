package Logica;

import java.util.Comparator;

public class CompararVehiculos implements Comparator<Vehiculo> {

    @Override
    public int compare(Vehiculo o1, Vehiculo o2) {
        if (o1.getPrecio() > o2.getPrecio()) {
            return -1;
        } else if (o1.getPrecio() > o2.getPrecio()) {
            return 0;
        } else {
            return 1;

        }
    }

}
