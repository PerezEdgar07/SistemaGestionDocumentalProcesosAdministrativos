
package sistemagestiondocumentalprocesosadministrativos.Controladores;

import sistemagestiondocumentalprocesosadministrativos.Servicio.DispositivoServicio;
import sistemagestiondocumentalprocesosadministrativos.Vistas.DispositivoVista;


public class DispositivoControlador {
private DispositivoServicio dispositivoServicio;
private DispositivoVista dispositivoVista;

    public DispositivoControlador(DispositivoServicio dispositivoServicio, DispositivoVista dispositivoVista) {
        this.dispositivoServicio = dispositivoServicio;
        this.dispositivoVista = dispositivoVista;
    }

public void registratDispositivo() {
        // Implementación para registrar un dispositivo
    }

    public DispositivoControlador buscarDispositivo(String cedula) {
        // Implementación para buscar un dispositivo
        return null;
    }

    public void actualizrDispositivo(String cedula) {
        // Implementación para actualizar un dispositivo
    }

    public void getEstadisticas() {
        // Implementación para obtener estadísticas de dispositivos
    }
}
