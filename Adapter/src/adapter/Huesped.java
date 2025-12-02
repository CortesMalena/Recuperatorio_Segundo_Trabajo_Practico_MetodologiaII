/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

/**
 *
 * @author User
 */
public class Huesped {
    private String nombre;
    private String apellido;
    private String email;
    private int nroTarjeta;

    public Huesped(String nombre, String apellido, String email, int nroTarjeta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.nroTarjeta = nroTarjeta;
    }
    
    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Email: " + email);
        System.out.println("Número tarjeta: " + nroTarjeta);
    }
    
    public String getEmail() {
        return email;
    }

    public int getNumeroTarjeta() {
        return nroTarjeta;
    }
}
