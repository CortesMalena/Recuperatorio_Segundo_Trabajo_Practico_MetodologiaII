/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

/**
 *
 * @author User
 */
public class Reserva {
    private Huesped huesped;
    private double montoTotal;


    public Reserva(Huesped huesped, double montoTotal) {
        this.huesped = huesped;
        this.montoTotal = montoTotal;
    }

    public double getMontoTotal() {
        return montoTotal;
    }
    
    public String getEmailDelHuesped() {
        return huesped.getEmail();
    }
    
     public int getNroTarjetaDelHuesped() {
        return huesped.getNumeroTarjeta();
    }
    
    public void pagarCon(MetodoPago medio) {
        medio.realizarPago(this);
    }
    
    public void mostrarDetalleReserva() {
        System.out.println("El huesped con correo: " + this.huesped.getEmail() + " realizo una reserva.");
        System.out.println("La cual es de un monto total de $" + this.montoTotal);
    }

}
