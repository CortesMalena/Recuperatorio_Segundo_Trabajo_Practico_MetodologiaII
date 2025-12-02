/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author User
 */
public class ConsolaRegistros implements Observer {
    @Override
    public void actualizar(Sensor sensor) {
        System.out.println("REGISTRO DE CONSOLA: " + sensor.getTipoValorALeer() + 
        " actualizado a " + sensor.getLectura() + 
        ". (Umbral: " + sensor.getUmbralMaximo() + ")");
    }
}
