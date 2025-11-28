
package sistemagestiondocumentalprocesosadministrativos.Servicio;

import java.util.List;
import sistemagestiondocumentalprocesosadministrativos.Modelo.Dispositivo;


public interface DispositivoServicio {
Dispositivo registrarDispositivo(Dispositivo dispositivo);
    Dispositivo obtenerDispositivo(String cedula);
    Dispositivo actualizarDispositivo(Dispositivo dispositivo);
    void eliminarDispositivo(String cedula);
    List<Dispositivo> obtenerTodosLosDispositivos();
}
