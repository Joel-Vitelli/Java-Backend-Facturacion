/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package facturacionmejorado;

/**
 *
 * @author Alumno
 */
public class Producto {

        private long idProducto;
        private String nombreProducto;
        private double precioUnitario;
        private DetalleFactura unDetalle;

    public DetalleFactura getUnDetalle() {
        return unDetalle;
    }

    public void setUnDetalle(DetalleFactura unDetalle) {
        this.unDetalle = unDetalle;
    }

    public Producto(long idProducto, String nombreProducto, double precioUnitario, DetalleFactura unDetalle) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precioUnitario = precioUnitario;
        this.unDetalle = unDetalle;
    }


    public Producto() {
    }
    public Producto (long pidProducto, String pnombreProducto, double pprecioUnitario){
      idProducto = pidProducto;
      precioUnitario = pprecioUnitario;
      nombreProducto = pnombreProducto;
    }

    
    public void setIdProducto(long pidProducto){
      idProducto = pidProducto;
    }
    public long getIdProducto(){
      return idProducto;
    }
    public void setPrecioUnitario(double pprecioUnitario){
      precioUnitario = pprecioUnitario;
    }
    public double getPrecioUnitario(){
      return precioUnitario;
    }
    public void setNombreProducto (String pnombreProducto){
      nombreProducto = pnombreProducto;
    }
    public String getNombre (){
      return nombreProducto;
    }

}
