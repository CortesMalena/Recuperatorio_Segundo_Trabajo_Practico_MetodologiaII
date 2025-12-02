/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

/**
 *
 * @author User
 */
public class BilleteraVirtual {
    
    public void pagar (String email, double montoTotal) {
        System.out.println("[BilleteraVirtual] Pagando desde billetera virtual el monto $" + 
                montoTotal + " del huesped con el email: " + 
                email);
    }
}
