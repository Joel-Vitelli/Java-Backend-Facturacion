/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package facturacionmejorado;

/**
 *
 * @author Alumno
 */
public class DetalleFactura {
    private Factura factura;
    private Producto producto;
    private int cantidad;

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public DetalleFactura() {
    }

    public DetalleFactura(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double calcularSubtotal (){
        return producto.getPrecioUnitario() * cantidad;
    }

       public void establecerDetalle (Factura fac){

    }

  public long buscarProductoId(){


        return producto.getIdProducto();
    }

  public double buscarProductoPrecio(){


        return producto.getPrecioUnitario();
    }
    public String buscarProductoDescripcion(){

        return producto.getNombre();
    }

}
