/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adapter;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("   INICIANDO SISTEMA   ");
        System.out.println("=================================================");
        // Huesped y reserva 
        Huesped huesped = new Huesped("Pepe", "Gomez", "Pepe@gmail.com", 11111117 );
    
        Reserva reserva = new Reserva(huesped, 25000);
        
        reserva.mostrarDetalleReserva();
        
        // Medios de pago, Billetera
        MetodoPago pagoConBilletera = new BilleteraVirtualAdapter();
        
        reserva.pagarCon(pagoConBilletera);
      
         System.out.println("=================================================");
        
        // Nueva reserva 
        Reserva otraReserva = new Reserva(huesped, 50000);
        
        otraReserva.mostrarDetalleReserva();
        
        // Medios de pago, Tarjeta
        MetodoPago pagoConTarjeta = new TarjetaCreditoAdapter();
        
        otraReserva.pagarCon(pagoConTarjeta);
        
        System.out.println("   FINALIZANDO SISTEMA   ");
    }
    
}
