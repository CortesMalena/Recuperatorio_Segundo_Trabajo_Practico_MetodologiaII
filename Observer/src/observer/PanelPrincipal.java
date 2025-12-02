/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author User
 */
public class PanelPrincipal implements Observer {
    @Override
    public void actualizar(Sensor sensor) {
        System.out.println("PANEL PRINCIPAL: Mostrar valor de " + 
        sensor.getTipoValorALeer() + ": " + 
        sensor.getLectura());
    }
}
