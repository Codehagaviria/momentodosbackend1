public class Video extends Materialeducativo {
    //Atributos private
    private int tiempo; // duración en minutos
    private String calidad; // Ej. HD, 4K

    // Constructor de Video
    public Video(String nivelEducativo, int duracion, String calidad) {
        super(nivelEducativo, "Video");
        this.tiempo = duracion;
        this.calidad = calidad;
    }

    @Override
    public double calculosCosto() {
        return tiempo * 5.0;
    }

    @Override
    public String generarMaterial() {
        return "Video para nivel " + getNivelEducativo() + " de " + tiempo + " minutos, calidad: " + calidad;
    }

    //Metodos GET y SET
    public int getDuracion() {
        return tiempo;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setDuracion(int duracion) {
        this.tiempo = duracion;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }
}

