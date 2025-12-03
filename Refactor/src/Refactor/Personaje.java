package Refactor;

public class Personaje {

    private String nombre;
    private int fuerzaBase;
    private TipoHabilidad habilidad;

    public Personaje(String nombre, int fuerzaBase, TipoHabilidad habilidad) {
        this.nombre = nombre;
        this.fuerzaBase = fuerzaBase;
        this.habilidad = habilidad;
    }

    public void setHabilidad (TipoHabilidad habilidadNueva) {
        this.habilidad = habilidadNueva;
    }

    public void imprimirInfo() {
        System.out.println("Personaje: " + nombre);
        System.out.println("Fuerza base: " + fuerzaBase);
        habilidad.imprimirInfo();
        int fuerzaFinal = calcularFuerzaFinal();
        System.out.println("Fuerza final: " + fuerzaFinal);
    }

    public int calcularFuerzaFinal() {
        return habilidad.calcularDanio(fuerzaBase);
    }

    public String getNombre() {
        return nombre;
    }
}
