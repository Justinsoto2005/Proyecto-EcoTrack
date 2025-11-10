package ecotrack;

public class ListaCircularDoble {
    public class Nodo {
        public Residuo dato;
        public Nodo siguiente;
        public Nodo anterior;

        public Nodo(Residuo dato) {
            this.dato = dato;
            this.siguiente = this; 
            this.anterior = this;
        }
    }

    private Nodo head;
    private int size; 

    public ListaCircularDoble() {
        this.head = null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(Residuo residuo) {
        Nodo nuevoNodo = new Nodo(residuo);

        if (isEmpty()) {
            head = nuevoNodo;
        } else {
            Nodo tail = head.anterior;

            nuevoNodo.siguiente = head;
            nuevoNodo.anterior = tail;

            tail.siguiente = nuevoNodo;
            head.anterior = nuevoNodo;
        }
        
        size++;
    }

    public Residuo getFirst() {
        if (isEmpty()) {
            return null;
        }
        return head.dato;
    }

    public Nodo getHeadNode() {
        return this.head;
    }
}