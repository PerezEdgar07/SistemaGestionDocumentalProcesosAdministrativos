
package sistemagestiondocumentalprocesosadministrativos.Servicio;

import java.util.List;


public interface IdiomaServicio {
 IdiomaServicio registrarIdioma(IdiomaServicio idioma);
    IdiomaServicio obtenerIdioma(int id);
    IdiomaServicio actualizarIdioma(IdiomaServicio idioma);
    void eliminarIdioma(int id);
    List<IdiomaServicio> obtenerTodosLosIdiomas();
}
