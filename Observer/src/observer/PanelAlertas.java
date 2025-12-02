/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author User
 */
public class PanelAlertas implements Observer {
    @Override
    public void actualizar(Sensor sensor) {
        
        // Lógica de Alerta: solo notifica si se supera el umbral
        if (sensor.getLectura() > sensor.getUmbralMaximo()) {
            System.out.println("[ALERTA] SUPERADO UMBRAL para " + 
            sensor.getTipoValorALeer() + 
            ". Valor: " + sensor.getLectura() + 
            " > Umbral: " + sensor.getUmbralMaximo());
        } else {
            System.out.println("Panel Alertas: Valor de " + 
            sensor.getTipoValorALeer() + " OK (" + 
            sensor.getLectura() + ")");
        }
    }
}
