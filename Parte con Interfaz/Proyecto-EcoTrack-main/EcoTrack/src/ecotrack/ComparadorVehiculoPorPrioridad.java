package ecotrack;

import java.util.Comparator;

public class ComparadorVehiculoPorPrioridad implements Comparator<Vehiculo> {

    @Override
    public int compare(Vehiculo v1, Vehiculo v2) {
        // Mayor prioridad primero
        return Double.compare(v2.getPrioridadCalculada(), v1.getPrioridadCalculada());
    }
}

