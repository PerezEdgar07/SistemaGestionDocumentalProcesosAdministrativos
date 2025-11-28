
package sistemagestiondocumentalprocesosadministrativos.Controladores;

import java.util.List;
import sistemagestiondocumentalprocesosadministrativos.Modelo.PersonasIdioma;
import sistemagestiondocumentalprocesosadministrativos.Servicio.IdiomaServicio;
import sistemagestiondocumentalprocesosadministrativos.Vistas.IdiomaVista;


public class IdiomaControlador {
private IdiomaServicio idiomaServicio;
    private PersonasIdioma personasIdioma;
    private IdiomaVista idiomaVista;

    public IdiomaControlador(IdiomaServicio idiomaServicio, PersonasIdioma personasIdioma, IdiomaVista idiomaVista) {
        this.idiomaServicio = idiomaServicio;
        this.personasIdioma = personasIdioma;
        this.idiomaVista = idiomaVista;
    }
    public void resgistarIdioma() {
        // Implementación para registrar un idioma
    }

    public void asignarIdiomaPersona() {
        // Implementación para asignar un idioma a una persona
    }

    public List<PersonasIdioma> setIdiomaPersona(String cedula) {
        // Implementación para establecer el idioma de una persona
        return null;
    }

    public void getEstaditicaIdioma() {
        // Implementación para obtener estadísticas de idiomas
    }
}

