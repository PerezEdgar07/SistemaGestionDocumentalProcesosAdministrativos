
package sistemagestiondocumentalprocesosadministrativos.Servicio;

import java.util.List;
import sistemagestiondocumentalprocesosadministrativos.Modelo.NivelSocioEconomico;


public interface NivelSocioeconomicoServicio {
NivelSocioEconomico asignarNivel(NivelSocioEconomico nivel);
    NivelSocioEconomico obtenerNivel(String cedula);
    NivelSocioEconomico actualizarNivel(NivelSocioEconomico nivel);
    void eliminarNivel(String cedula);
    List<NivelSocioEconomico> obtenerTodosLosNiveles();
}
