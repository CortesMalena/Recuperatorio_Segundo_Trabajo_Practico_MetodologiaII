/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observer;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("   INICIANDO SISTEMA DE MONITOREO AMBIENTAL");
        System.out.println("=================================================");

        Observer consola = new ConsolaRegistros();
        Observer panelPrincipal = new PanelPrincipal();
        Observer panelAlertas = new PanelAlertas();

        // Valores: (Umbral Máximo)
        Sensor sensorTemp = new SensorTemperatura(30);
        Sensor sensorHum = new SensorHumedad(60);
        Sensor sensorCO2 = new SensorCO2(800);
        Sensor sensorLuz = new SensorLuminosidad(1000);


        // Suscribir Observadores a Sensores (agregarObserver)
        System.out.println("\n--- Configuración Inicial de Paneles ---");
        
        // Todos los paneles observan la Temperatura y Humedad
        sensorTemp.agregarObserver(consola);
        sensorTemp.agregarObserver(panelPrincipal);
        sensorTemp.agregarObserver(panelAlertas);
        
        sensorHum.agregarObserver(panelAlertas);
        sensorHum.agregarObserver(consola);
        sensorHum.agregarObserver(panelPrincipal);

        // Solo la Consola y Alertas observan CO2
        sensorCO2.agregarObserver(consola);
        sensorCO2.agregarObserver(panelAlertas);
        
        // Panel principal observa Luminosidad 
        sensorLuz.agregarObserver(panelPrincipal);
        

        System.out.println("\n--- SIMULACIÓN DE LECTURAS ---");

        // Lectura 1: Cambio normal de temperatura
        System.out.println("\n[SISTEMA]: El Sensor Temperatura lee 27...");
        sensorTemp.setLecturaSensor(27); 

        // Lectura 2: Cambio que dispara una alerta
        System.out.println("\n[SISTEMA]: El Sensor CO2 lee 950 (¡ALERTA!)...");
        sensorCO2.setLecturaSensor(950); 
        
        // Lectura 3: Cambio de luminosidad
        System.out.println("\n[SISTEMA]: El Sensor Luminosidad lee 100...");
        sensorLuz.setLecturaSensor(100); 

        // 5. Simulación de cambio de suscripción (Desactivar Consola en Temp)
        System.out.println("\n--- Desactivando Consola de Sensor Temperatura ---");
        sensorTemp.eliminarObserver(consola);
        
        System.out.println("\n[SISTEMA]: El Sensor Temperatura lee 28...");
        sensorTemp.setLecturaSensor(28);

        System.out.println("Fin de la simulación.");
    }
    
}
