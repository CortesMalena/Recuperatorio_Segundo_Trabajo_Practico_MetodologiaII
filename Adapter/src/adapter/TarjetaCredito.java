/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

/**
 *
 * @author User
 */
public class TarjetaCredito {
    
    public boolean validarLimite(int numeroTarjeta, double montoTotal) {
        System.out.println("[Validacion Limite] Validando limite de la tarjeta " + 
                numeroTarjeta + 
                "...");
        return true;
    }
    
    public void pagar (int numeroTarjeta, double montoTotal) {
        if (this.validarLimite(numeroTarjeta, montoTotal)) {
            System.out.println("[TarjetaCredito] Pagando desde la tarjeta de Credito el monto $" + 
                    montoTotal + "..."
                    );
        } else {
            System.out.println("[TarjetaCredito] No se pudo realizar el pago.");
        }
    }
}
