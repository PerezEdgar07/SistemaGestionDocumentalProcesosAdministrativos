
package sistemagestiondocumentalprocesosadministrativos.Servicio;

import java.util.List;
import sistemagestiondocumentalprocesosadministrativos.Modelo.EstadoTramite;
import sistemagestiondocumentalprocesosadministrativos.Modelo.TramitePersonas;


public interface TramiteServicio {

     TramitePersonas agregarTramite(TramitePersonas tramite);
     TramitePersonas obtenerTramite(int id);
     TramitePersonas actualizarTramite(TramitePersonas tramite);
     void eliminarTramite(int id);
     void cambiarEstadoTramite(int id, EstadoTramite estado);
     List<TramitePersonas> obtenerTodosLosTramites();
}
