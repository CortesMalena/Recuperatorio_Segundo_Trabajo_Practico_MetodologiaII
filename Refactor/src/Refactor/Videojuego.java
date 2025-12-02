package Refactor;

import java.util.ArrayList;
import java.util.List;

public class Videojuego {
    private String nombreVideojuego;
    private List<Personaje> personajes = new ArrayList<>();

    public Videojuego(String nombreVideojuego) {
        this.nombreVideojuego = nombreVideojuego;
    }

    public void agregarPersonaje(Personaje p) {
        personajes.add(p);
    }

    public Personaje obtenerMayorDanio() {
        if (this.personajes.isEmpty()) return null;

        Personaje personajeMaxDanio = this.personajes.get(0);

        for (Personaje p : this.personajes) {
            if (p.calcularFuerzaFinal() > personajeMaxDanio.calcularFuerzaFinal()) {
                personajeMaxDanio = p;
            }
        }

        return personajeMaxDanio;
    }

    public void mostrarInformacion() {

        System.out.println("=== Información de personajes del videojuego " + this.nombreVideojuego + " ===");
        for (Personaje p : personajes) {
            p.imprimirInfo();
            System.out.println("--------------------------");
        }
    }
}
