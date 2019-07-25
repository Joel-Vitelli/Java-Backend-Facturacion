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
public class Factura extends Comprobante { 

    

    private String tipoFactura;
    
    private ArrayList<DetalleFactura> detalleFactura;

    public Factura() {
    }

    public Factura(int pnumero, String pfecha, Persona cliente, String tipoFactura, Persona vendedor) {
        super(pnumero, pfecha);
        this.tipoFactura = tipoFactura;
        detalleFactura = new ArrayList();
       
        persona.add(cliente);
        persona.add(vendedor);
    }

    

  
    public ArrayList getDetalleFactura() {
        return detalleFactura;
    }

    public void setDetalleFactura(ArrayList detalleFactura) {
        this.detalleFactura = detalleFactura;
    }

    public String getTipoFactura() {
        return tipoFactura;
    }

    public void setTipoFactura(String tipoFactura) {
        this.tipoFactura = tipoFactura;
    }

    
    

    public double debeTenerTotal(){
        double total = 0.0;
        for(int i=0; i< detalleFactura.size();i++){
          //cast pq arraylist tiene tipos objects
          total = total + detalleFactura.get(i).calcularSubtotal();
        }
        return total;
    }

    public String debeTenerTipoComprobante(){
        return tipoFactura;
    }


    public String debeTenerTitular(){
        int i;
        for(i=0;i<persona.size();i++){
            if( persona.get(i) instanceof Cliente){
               String nombre = persona.get(i).getNombre() + " " +persona.get(i).getApellido();
               return nombre;
            }else return "No existe titular";
        }
        return "No existe titular";
    }

    public void agregarLineaDetalle( Producto xproducto, int cantidad){
        DetalleFactura linea = new DetalleFactura();
        linea.setProducto(xproducto);
        linea.setCantidad(cantidad);
        detalleFactura.add(linea);

    }


    public void imprimeDetalle(){
        //Factura factura = new Factura();

        System.out.println("-----------------Detalle-----------------------");
        System.out.println("Codigo  Descripcion  Cant  Precio");

        for(int i=0; i<this.getDetalleFactura().size(); i++){
                DetalleFactura detalle = (DetalleFactura) (this.getDetalleFactura().get(i));

                System.out.print(detalle.buscarProductoId()+"    ");
                System.out.print(detalle.buscarProductoDescripcion()+"        ");
                System.out.print(detalle.getCantidad()+"        ");
                System.out.print(detalle.buscarProductoPrecio());
                System.out.println(" ");
            }
             System.out.println("                      Total: "+this.debeTenerTotal());
    }

    public void mostrarEncabezado(){
        System.out.println("--------------Supermercado Java----------------");
            System.out.println("              Factura tipo "+ this.getTipoFactura());
            System.out.print("Nro.: "+ this.debeTenerNumero());
            System.out.println("  Fecha: "+ this.getFecha());
            System.out.println("-----------------Cliente-----------------------");
            System.out.println(this.buscaCliente());

            System.out.println(this.buscaClienteDireccion());

            System.out.println("-----------------Vendedor----------------------");
            System.out.println(this.buscaVendedor());
    }

    public void imprimeFactura(){
        mostrarEncabezado();
        imprimeDetalle();
    }



}
