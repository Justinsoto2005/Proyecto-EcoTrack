package ecotrack;

import java.util.Comparator;

public class ComparadorResiduoPorPrioridad implements Comparator<Residuo> {

    @Override
    public int compare(Residuo r1, Residuo r2) {
        return Integer.compare(r2.getPrioridadAmbiental(), r1.getPrioridadAmbiental());
    }
}