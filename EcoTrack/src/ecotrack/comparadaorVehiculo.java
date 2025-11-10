package ecotrack;
import java.util.Comparator;


public class ComparadorVehiculo implements Comparator<Vehiculo> {
    @Override
    public int compare(Vehiculo a, Vehiculo b) {
        return Integer.compare(a.getPrioridad(), b.getPrioridad());
    }
    @Override
    public int compare(Vehiculo a, Vehiculo b) {
        return Double.compare(a.getCapacidadKg(), b.getCapacidadKg());
    }
}
