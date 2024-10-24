//Se define la clase
public class Materialeducativo {
    // Atributos - modificador de acceso private
    private String nivelEducativo;
    private String tipo;

    //Metodo constructor
    public Materialeducativo(String nivelEducativo, String tipo) {
        this.nivelEducativo = nivelEducativo;
        this.tipo = tipo;
    }
    //se crea el metodo generar material segun tipo y nivel de educacion
    public String generarMaterial() {
        return "Generar " + tipo + " para el nivel " + nivelEducativo;
    }

    //Metodos GET y SET

    public String getNivelEducativo() {
        return nivelEducativo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNivelEducativo(String nivelEducativo) {
        this.nivelEducativo = nivelEducativo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public double calculosCosto() {
        return 0;
    }
}
