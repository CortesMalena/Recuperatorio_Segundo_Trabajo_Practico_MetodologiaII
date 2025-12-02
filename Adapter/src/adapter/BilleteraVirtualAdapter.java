/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

/**
 *
 * @author User
 */
public class BilleteraVirtualAdapter implements MetodoPago {
    
    private BilleteraVirtual billeteraVirtual;

    public BilleteraVirtualAdapter() {
        this.billeteraVirtual = new BilleteraVirtual();
    }
    
    @Override
    public void realizarPago(Reserva reserva) {
        this.billeteraVirtual.pagar(reserva.getEmailDelHuesped(), reserva.getMontoTotal());
    }
    
}
