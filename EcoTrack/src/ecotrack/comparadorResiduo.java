package ecotrack;

import java.util.Comparator;

public class ComparadorResiduoPorPeso implements Comparator<Residuo> {

    @Override
    public int compare(Residuo r1, Residuo r2) {
        return Double.compare(r1.getPeso(), r2.getPeso());
    }
    @Override
    public int compare(Residuo r1, Residuo r2) {
        return r1.getTipo().compareToIgnoreCase(r2.getTipo());
    }
    @Override
    public int compare(Residuo r1, Residuo r2) {
        return Integer.compare(r2.getPrioridadAmbiental(), r1.getPrioridadAmbiental());
    }
}
