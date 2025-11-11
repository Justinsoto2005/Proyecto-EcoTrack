package ecotrack;

import java.util.Comparator;

public class ComparadorResiduoPorTipo implements Comparator<Residuo> {

    @Override
    public int compare(Residuo r1, Residuo r2) {
        return r1.getTipo().compareToIgnoreCase(r2.getTipo());
    }
}