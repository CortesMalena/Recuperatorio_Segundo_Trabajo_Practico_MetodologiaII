/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author User
 */
public class SensorHumedad extends Sensor {
    public SensorHumedad( int umbral) {
        super("Humedad", umbral);
    }
    
    @Override
    public void establecerValor() {
        // Lógica de lectura de humedad
    }
}
