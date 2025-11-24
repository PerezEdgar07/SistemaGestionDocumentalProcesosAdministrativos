
package sistemagestiondocumentalprocesosadministrativos.Servicio;

import java.util.List;
import sistemagestiondocumentalprocesosadministrativos.Modelo.Persona;


public interface PersonaServicio {
Persona crearPersona(Persona persona);
Persona buscarPersona(String cedula);
Persona actualizarPersona(Persona persona);
void eliminarPersona(String cedula);
List<Persona>obtenerTOdasLasPersonas();
}
