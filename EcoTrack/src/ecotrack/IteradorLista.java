package ecotrack;

public class IteradorLista {
    private ListaCircularDoble.Nodo actual;

    IteradorLista(ListaCircularDoble.Nodo head) {
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
        if (!hasNext()) {
            return null;
        }
        Residuo dato = actual.dato;
        actual = actual.anterior;
        return dato;
    }

    public Residuo getData() {
        if (!hasNext()) {
            return null;
        }
        return actual.dato;
    }
}
