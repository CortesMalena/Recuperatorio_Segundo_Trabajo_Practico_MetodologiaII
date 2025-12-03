package Refactor;

public class HabilidadCuerpoACuerpo implements TipoHabilidad{


    @Override
    public String getDescripcion() {
        return "Habilidad Cuerpo a cuerpo";
    }

    @Override
    public int calcularDanio(int fuerzaBase) {
        return fuerzaBase;
    }

    @Override
    public void imprimirInfo() {
        System.out.println( getDescripcion() + ", esta habilidad mantiene tu fuerza.");
    }

}
