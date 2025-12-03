/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
abstract public class Sensor {
    protected List<Observer> observadores = new ArrayList<>();
    protected int lectura;
    protected String tipoValorALeer;
    protected int umbralMaximo;

    public Sensor(String tipo, int umbral) {
        this.tipoValorALeer = tipo;
        this.lectura = 0;
        this.umbralMaximo = umbral;
    }

    public void agregarObserver(Observer observer) {
        if (!observadores.contains(observer)) {
            observadores.add(observer);
            System.out.println("   -> Suscrito: " + observer.getClass().getSimpleName() + " a " + this.tipoValorALeer);
        }
    }

    public void eliminarObserver(Observer observer) {
        observadores.remove(observer);
    }

    public void setLecturaSensor(int valor) {
        leerDeFormaEspecifica(valor);
        this.lectura = valor;
        notificarObserver();
    }
    
    protected void notificarObserver() {
        if (observadores.isEmpty()) {
            System.out.println(" [INFO]: No hay observadores suscritos a " + this.tipoValorALeer + ".");
        }
        for (Observer obs : observadores) {
            obs.actualizar(this);
        }
    }

    public int getLectura() { return lectura; }
    public String getTipoValorALeer() { return tipoValorALeer; }
    public int getUmbralMaximo() { return umbralMaximo; }

    public abstract void leerDeFormaEspecifica(int valor);
}
