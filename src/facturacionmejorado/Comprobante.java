
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
public abstract class Comprobante implements Dgi{

    protected int numero;
    protected String fecha;
    protected ArrayList<Persona> persona;



    public Comprobante() {
         persona = new ArrayList();
    }

    public Comprobante(int pnumero, String pfecha) {
        numero = pnumero;
        fecha = pfecha;
         persona = new ArrayList();
    }

    public String buscaCliente() {
        String nombre = null;
        for(int i=0;i < persona.size();i++){
            if( persona.get(i) instanceof Cliente){
              nombre = persona.get(i).getNombre() + " " + persona.get(i).getApellido();
            }
        }
        return nombre;
    }

    public String buscaVendedor() {
        String nombre = null;
        for(int i=0;i < persona.size();i++){
            if( persona.get(i) instanceof Vendedor){
              nombre = persona.get(i).getNombre() + " " + persona.get(i).getApellido();
            }
        }
        return nombre;
    }

     public String buscaClienteDireccion() {
        String direccion = null;
        for(int i=0;i < persona.size();i++){
            if( persona.get(i) instanceof Cliente){
                direccion = persona.get(i).getDireccion();
            }
        }
        return direccion;
    }


    public void setFecha(String pfecha) {
        fecha = pfecha;
    }

    public void setNumero(int pnumero) {
        numero = pnumero;
    }

    public String getFecha() {
        return fecha;
    }

    public int getNumero() {
        return numero;
    }

    public int debeTenerNumero(){
        return numero;
    }
  
    public String debeTenerFecha(){
        return fecha;
    }

    abstract public double debeTenerTotal();
    abstract public String debeTenerTipoComprobante();
    abstract public String debeTenerTitular();
 }
