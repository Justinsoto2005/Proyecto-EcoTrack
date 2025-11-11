package ecotrack;

import java.util.Stack;
import java.util.PriorityQueue;
import java.util.Map;
import java.util.HashMap;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SistemaEcoTrack {

    private ListaCircularDoble listaResiduos;
    private PriorityQueue<Vehiculo> colaVehiculos;
    private Stack<Residuo> pilaCentroReciclaje;
    private Map<String, Double> estadisticasPorTipo;

    private Comparator<Residuo> compPorPeso;
    private Comparator<Residuo> compPorTipo;
    private Comparator<Residuo> compPorPrioridad;

    public SistemaEcoTrack() {
        this.listaResiduos = new ListaCircularDoble();
        this.colaVehiculos = new PriorityQueue<>(new ComparadorVehiculoPorPrioridad());
        this.pilaCentroReciclaje = new Stack<>();
        this.estadisticasPorTipo = new HashMap<>();
        
        this.compPorPeso = new ComparadorResiduoPorPeso();
        this.compPorTipo = new ComparadorResiduoPorTipo();
        this.compPorPrioridad = new ComparadorResiduoPorPrioridad();
    }

    public void agregarResiduo(Residuo r) {
        this.listaResiduos.addLast(r);
        actualizarEstadisticas(r);
    }

    public void agregarVehiculo(Vehiculo v) {
        this.colaVehiculos.add(v);
    }

    public Vehiculo despacharVehiculo() {
        Vehiculo v = this.colaVehiculos.poll();
        return v;
    }

    public void enviarAReciclaje(Residuo r) {
        this.pilaCentroReciclaje.push(r);
    }
    
    public Residuo procesarResiduoCentro() {
        Residuo r = this.pilaCentroReciclaje.pop();
        return r;
    }
    
    private void actualizarEstadisticas(Residuo r) {
        String tipo = r.getTipo();
        double peso = r.getPeso();
        double pesoActual = this.estadisticasPorTipo.getOrDefault(tipo, 0.0);
        this.estadisticasPorTipo.put(tipo, pesoActual + peso);
    }

    public List<Residuo> getResiduosOrdenados(Comparator<Residuo> comparador) {
        
        List<Residuo> listaTemporal = new ArrayList<>();
        
        IteradorLista iterador = this.listaResiduos.iterador();
        
        if (iterador.hasNext()) {
            int size = this.listaResiduos.getSize();
            for (int i = 0; i < size; i++) {
                listaTemporal.add(iterador.next());
            }
        }
        
        if (comparador != null) {
            Collections.sort(listaTemporal, comparador);
        }
        
        return listaTemporal;
    }

    public Comparator<Residuo> getCompPorPeso() {
        return compPorPeso;
    }

    public Comparator<Residuo> getCompPorTipo() {
        return compPorTipo;
    }

    public Comparator<Residuo> getCompPorPrioridad() {
        return compPorPrioridad;
    }
}