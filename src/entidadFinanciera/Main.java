/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author carre
 */
public class Main {
/**
 * 
 * @param args Main de todo el programa 
 */
    public static void main(String[] args) {
        CCuenta objetoCuenta;

        double saldoActual;
        

        objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        
        try {
            probarIngresar(objetoCuenta, 500, objetoCuenta);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try {
            probarRetirar(objetoCuenta, 500, objetoCuenta);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    /**
     * 
     * @param c Cuenta donde ingresaremos
     * @param cantidad Cantidad a ingresad
     * @param cantidadEsperada Cuenta con el resultado esperado
     * @throws Exception 
     */
    public static void probarIngresar(CCuenta c, int cantidad, CCuenta cantidadEsperada) throws Exception{
        c.ingresar(cantidad);
        
    }
    
        /**
     * 
     * @param c Cuenta donde ingresaremos
     * @param cantidad Cantidad a retirar
     * @param cantidadEsperada Cuenta con el resultado esperado
     * @throws Exception 
     */
    public static void probarRetirar(CCuenta c, int cantidad, CCuenta cantidadEsperada) throws Exception{
        c.retirar(cantidad);
    }
}
