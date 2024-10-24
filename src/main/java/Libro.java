public class Libro extends Materialeducativo {
    // Atributos private
    private String editorial;
    private int numeropaginas;

    // Metodo construtor
    public Libro(String nivelEducativo, String editorial, int paginas) {
        super(nivelEducativo, "Libro");
        this.numeropaginas = paginas;
        this.editorial = editorial;
    }
    @Override
    public double calculosCosto() {
        return numeropaginas * 2.5; // Ejemplo: 0.5 por página
    }
    // Sobrescribir metodo generar material
    @Override
    public String generarMaterial() {
        return "Libro para el nivel " + getNivelEducativo() + " de " + numeropaginas + " páginas, editorial: " + editorial;
    }

    //Metodos GET y SET
    public int getPaginas() {
        return numeropaginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public void setPaginas(int paginas) {
        this.numeropaginas = paginas;
    }
}
