public class Main {
    public static void main(String[] args) {
        // Crear instancias de subclases
        Libro libro = new Libro("medio", " Corimbo", 200);
        Video video = new Video("superior", 45, "HD");

        // Generar materiales específicos
        System.out.println(libro.generarMaterial());
        System.out.println(video.generarMaterial());

        // Calcular el costo
        System.out.println("Costo del libro: " + libro.calculosCosto());
        System.out.println("Costo del video: " + video.calculosCosto());
    }
}

