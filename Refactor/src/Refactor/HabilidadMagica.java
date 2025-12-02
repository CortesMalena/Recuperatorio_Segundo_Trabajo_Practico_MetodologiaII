package Refactor;

public class HabilidadMagica implements TipoHabilidad {
    private static final int MULTIPLICADOR_DANIO = 2;

    @Override
    public String getDescripcion() {
        return "Habilidad mágica";
    }

    @Override
    public int calcularDaño(int fuerzaBase) {
        return fuerzaBase * MULTIPLICADOR_DANIO;
    }

    @Override
    public void imprimirInfo() {
        System.out.println(getDescripcion() + ", esta habilidad dobla tu fuerza.");
    }
}
