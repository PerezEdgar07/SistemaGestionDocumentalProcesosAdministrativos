
package sistemagestiondocumentalprocesosadministrativos.Servicio;

import java.util.List;


public interface ReportesServicio {
List<Object> generarReporteTramites();
List<Object> generarReportePersonas();
List<Object> generarReporteDispositivos();
List<Object> generarReporteIdiomas();
void exportarReporte(String tipo);
}
