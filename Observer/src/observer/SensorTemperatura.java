/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author User
 */
public class SensorTemperatura extends Sensor {
    public SensorTemperatura(int umbral) {
        super("Temperatura", umbral);
    }
    
    @Override
    public void establecerValor() {
        // En un sistema real, aquí se leería el hardware.
    }
}



