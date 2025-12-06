
package sistemagestiondocumentalprocesosadministrativos.Modelo;

import java.util.Date;


public class Persona {

    private String cedula;
    private String nombres;
    private String apellidos;
    private boolean accesoInternet;
    private String correo;
    private Date fechaNacimiento;
    private String genero;

    public Persona(String cedula, String nombres, String apellidos, boolean accesoInternet, String correo, Date fechaNacimiento, String genero) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.accesoInternet = accesoInternet;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
    }
    
}
