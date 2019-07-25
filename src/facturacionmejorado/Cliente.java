/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package facturacionmejorado;

/**
 *
 * @author Alumno
 */
public class Cliente extends Persona{

    private int telefono;
    
    public Cliente() {
    }


    public Cliente(String nombre, String apellido, String documento, int telefono, String direccion) {
        super(nombre, apellido, documento);
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Cliente(int telefono, String direccion) {
        this.telefono = telefono;
        this.direccion = direccion;
    }


    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

}
