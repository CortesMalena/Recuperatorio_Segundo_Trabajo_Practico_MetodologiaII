package Refactor;

public class Main {
    public static void main(String[] args) {

        // Videojuegos, habilidades y los personajes
        Videojuego videojuego = new Videojuego("Zyrandor");

        HabilidadMagica habilidadMagica = new HabilidadMagica();
        HabilidadCuerpoACuerpo habilidadCuerpoACuerpo = new HabilidadCuerpoACuerpo();

        Personaje personaje1 = new Personaje("Auron", 50, habilidadMagica);
        Personaje personaje2 = new Personaje("Brutus", 80, habilidadCuerpoACuerpo);

        // Agregamos los personajes a los videojuegos
        videojuego.agregarPersonaje(personaje1);
        videojuego.agregarPersonaje(personaje2);

        // Mostramos la informacion del videojuego
        videojuego.mostrarInformacion();

        // Obtener personaje con mayor daño final
        Personaje mayorDanio = videojuego.obtenerMayorDanio();

        System.out.println("=== Personaje con mayor daño ===");
        if (mayorDanio != null) {
            System.out.println("Nombre: " + mayorDanio.getNombre());
            System.out.println("Daño final: " + mayorDanio.calcularFuerzaFinal());
        }

        // Cambiar de habilidad (permitido por el strategy)
        personaje1.setHabilidad(habilidadCuerpoACuerpo);

        //Vemos info completa
        System.out.println("");
        System.out.println("INFORMACION MODIFICADA");
        videojuego.mostrarInformacion();

        // ver el cambio de daños
         mayorDanio = videojuego.obtenerMayorDanio();

        System.out.println("=== Personaje con mayor daño ===");
        if (mayorDanio != null) {
            System.out.println("Nombre: " + mayorDanio.getNombre());
            System.out.println("Daño final: " + mayorDanio.calcularFuerzaFinal());
        }

    }
}