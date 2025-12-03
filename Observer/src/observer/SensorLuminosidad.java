/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author User
 */
public class SensorLuminosidad extends Sensor {
    public SensorLuminosidad( int umbral) {
        super("Luminosidad", umbral);
    }

     @Override
    public void leerDeFormaEspecifica(int valor) {
        // Lógica de lectura de Sensor luminosidad
        System.out.println("(SENSOR LUMINOSIDAD) Leyendo de forma especifica el valor "
                + valor + "...");
    }
}
