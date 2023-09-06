import servicios.Lector;
import servicios.Negocio;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cómo se llama el negocio de electrodomésticos?");
        Negocio n = new Negocio(Lector.leer().nextLine());
        n.menu();
    }
}