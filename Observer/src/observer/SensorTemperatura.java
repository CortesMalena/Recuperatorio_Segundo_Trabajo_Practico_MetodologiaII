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
    public void leerDeFormaEspecifica(int valor) {
        // Lógica de lectura de Sensor temperatura
        System.out.println("(SENSOR TEMPERATURA) Leyendo de forma especifica el valor "
                + valor + "...");
    }
}



