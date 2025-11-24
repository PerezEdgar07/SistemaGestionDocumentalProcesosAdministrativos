
package sistemagestiondocumentalprocesosadministrativos.Controladores;

import java.util.Map;
import sistemagestiondocumentalprocesosadministrativos.Modelo.Persona;
import sistemagestiondocumentalprocesosadministrativos.Modelo.Vistas.PersonaVista;
import sistemagestiondocumentalprocesosadministrativos.Servicio.PersonaServicio;


public class PersonaControlador {

     private PersonaServicio servicio;
    private PersonaVista vista;

    public PersonaControlador(PersonaServicio servicio, PersonaVista vista) {
        this.servicio = servicio;
        this.vista = vista;
    }

    
    public void handleRequest(Map<String, Object> data) {
        // Implementación para manejar las solicitudes
    }

    public void crearPersona() {
        // Implementación para crear una persona
    }

    public Persona buscarPersona(String cedula) {
        // Implementación para buscar una persona
        return null;
    }

    public void actualizarPersona(String cedula) {
        // Implementación para actualizar una persona
    }

    public void eliminarPersona(String cedula) {
        // Implementación para eliminar una persona
    }
    
}
