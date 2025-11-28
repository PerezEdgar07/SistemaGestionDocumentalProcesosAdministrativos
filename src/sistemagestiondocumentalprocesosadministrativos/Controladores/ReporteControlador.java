
package sistemagestiondocumentalprocesosadministrativos.Controladores;

import sistemagestiondocumentalprocesosadministrativos.Servicio.ReportesServicio;
import sistemagestiondocumentalprocesosadministrativos.Vistas.ReportesVista;


public class ReporteControlador {
private ReportesServicio reportesServicio;
    private ReportesVista reportesVista;

    public ReporteControlador(ReportesServicio reportesServicio, ReportesVista reportesVista) {
        this.reportesServicio = reportesServicio;
        this.reportesVista = reportesVista;
    }
    public void generarReporteTramite() {
        // Implementación para generar un reporte de trámites
    }

    public void generaReportePersonas() {
        // Implementación para generar un reporte de personas
    }

    public void generarReporteDisposotivos() {
        // Implementación para generar un reporte de dispositivos
    }

    public void generarReporteIdioma() {
        // Implementación para generar un reporte de idiomas
    }

    public void exportarReporte(String tipo) {
        // Implementación para exportar un reporte
    }
}
