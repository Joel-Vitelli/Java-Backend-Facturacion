/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package facturacionmejorado;

/**
 *
 * @author Alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona vendedor = new Vendedor("ALberto", "Cortez", "23232323", 23,"Deposito");
        Persona cliente = new Cliente("Juan", "Perez", "20202020", 4303030, "Rioja 1023");
        Factura factura = new Factura(1234 , "26/03/2010", cliente, "A", vendedor);

        Producto producto1 = new Producto(6256, "Cafe", 5.20);
        factura.agregarLineaDetalle(producto1, 3);

        Producto producto2 = new Producto(3336, "Pans", 1.50);
        factura.agregarLineaDetalle(producto2, 3);

        Consola consola = new Consola();
        consola.imprimir(factura);

    }

}
