package ecotrack;

public class IteradorLista {
    private Nodo actual;

    public IteradorLista(Nodo head) {
        this.actual = head;
    }

    public boolean hasNext() {
        return actual != null;
    }

    public Residuo next() {
        if (!hasNext()) {
            return null;
        }
        Residuo dato = actual.dato;
        actual = actual.siguiente;
        return dato;
    }

    public Residuo previous() {
        if (hasNext() == false) {
            return null;
        }
        Residuo dato = actual.dato;
        actual = actual.anterior;
        return dato;
    }

    public Residuo getData() {
        if (hasNext() == false) {
            return null;
        }
        return actual.dato;
    }
}