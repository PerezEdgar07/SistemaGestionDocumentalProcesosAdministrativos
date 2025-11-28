
package sistemagestiondocumentalprocesosadministrativos.Cola;

import sistemagestiondocumentalprocesosadministrativos.Modelo.TramitePersonas;


public class Nodo {
public TramitePersonas dato;
public Nodo siguiente;

    public Nodo(TramitePersonas dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }
 public TramitePersonas getDato() {
        return dato;
    }

    public void setDato(TramitePersonas dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }    
}
