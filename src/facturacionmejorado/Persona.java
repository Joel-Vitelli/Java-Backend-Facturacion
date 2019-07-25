/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package facturacionmejorado;

import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public abstract class Persona {

    protected String nombre;
    protected String apellido;
    protected String documento;
    protected ArrayList<Comprobante> comprobante;
    protected String direccion;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Comprobante> getComprobante() {
        return comprobante;
    }

    public void setComprobante(ArrayList<Comprobante> comprobante) {
        this.comprobante = comprobante;
    }



   

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



}
