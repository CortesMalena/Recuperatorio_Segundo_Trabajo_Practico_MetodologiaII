/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author User
 */
public class SensorCO2 extends Sensor {
    public SensorCO2( int umbral) {
        super("Nivel de CO2", umbral);
    }
    
    @Override
    public void leerDeFormaEspecifica(int valor) {
        // Lógica de lectura de CO2
        System.out.println("(SENSOR C02) Leyendo de forma especifica el valor "
                + valor + "...");
    }
}
