/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package facturacionmejorado;

/**
 *
 * @author Alumno
 */
public class Vendedor extends Persona {

    private long idVendedor;
    private String sector;

    public Vendedor() {
    }


    public Vendedor(String nombre, String apellido, String documento, long idVendedor, String sector) {
        super(nombre, apellido, documento);
        this.idVendedor = idVendedor;
        this.sector = sector;
    }

    public Vendedor(long idVendedor, String sector) {
        this.idVendedor = idVendedor;
        this.sector = sector;
    }


    public long getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(long idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }





}
