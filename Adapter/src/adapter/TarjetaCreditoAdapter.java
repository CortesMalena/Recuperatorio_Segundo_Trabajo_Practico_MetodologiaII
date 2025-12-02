/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adapter;

/**
 *
 * @author User
 */
public class TarjetaCreditoAdapter implements MetodoPago {
    private TarjetaCredito tarjetaCredito;

    public TarjetaCreditoAdapter() {
        this.tarjetaCredito = new TarjetaCredito();
    }
    
    @Override
    public void realizarPago(Reserva reserva) {
        this.tarjetaCredito.pagar(reserva.getNroTarjetaDelHuesped(), reserva.getMontoTotal());
    }
    
    
}
