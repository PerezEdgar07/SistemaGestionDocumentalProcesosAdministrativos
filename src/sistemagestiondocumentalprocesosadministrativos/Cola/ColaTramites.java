
package sistemagestiondocumentalprocesosadministrativos.Cola;

import java.util.LinkedList;
import java.util.List;
import sistemagestiondocumentalprocesosadministrativos.Modelo.EstadoTramite;
import sistemagestiondocumentalprocesosadministrativos.Modelo.TramitePersonas;


public class ColaTramites {
private Nodo frente;          // Apunta al primer nodo de la cola
    private Nodo ultimo;     // Apunta al último nodo de la cola
    private static ColaTramites instance;

   
    private ColaTramites() {
        frente = null;
        ultimo = null;
    }

    
    public static ColaTramites getInstance() {
        if (instance == null) {
            instance = new ColaTramites();
        }
        return instance;
    }

    public void enqueue(TramitePersonas tramite) {
    Nodo nuevoNodo = new Nodo(tramite);
    if (isEmpty()) {
        frente = nuevoNodo;
    } else {
        ultimo.siguiente = nuevoNodo;
    }
    ultimo = nuevoNodo;

    }

    public TramitePersonas dequeue() {
        if (isEmpty()) {
            return null;  // La cola está vacía
        }
        TramitePersonas dato = frente.dato;
        frente = frente.siguiente;
        if (frente == null) {
            ultimo = null;  // La cola quedó vacía
        }
        return dato;
    }

    public TramitePersonas peek() {
        if (isEmpty()) {
            return null;  // La cola está vacía
        }
        return frente.dato;
    }

    public boolean isEmpty() {
        return frente == null;
    }

    public int size() {
        int count = 0;
        Nodo actual = frente;
        while (actual != null) {
            count++;
            actual = actual.siguiente;
        }
        return count;
    }

    public List<TramitePersonas> obtenerPorEstado(EstadoTramite estado) {
        List<TramitePersonas> tramitesFiltrados = new LinkedList<>();
        Nodo actual = frente;
        while (actual != null) {
            if (actual.dato.getEstado() == estado) {
                tramitesFiltrados.add(actual.dato);
            }
            actual = actual.siguiente;
        }
        return tramitesFiltrados;
    }

    public void procesarSiguiente() {
        if (!isEmpty()) {
            TramitePersonas tramite = dequeue();
            // Lógica para procesar el trámite
            System.out.println("Procesando trámite: " + tramite.getIdTramite());
        } else {
            System.out.println("No hay trámites en la cola.");
        }
    }

}
