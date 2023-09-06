package servicios;

import java.util.ArrayList;

public class Negocio {
    private final String nombre;
    private final ArrayList<ElectrodomesticoServicio> stock = new ArrayList<>();

    public Negocio(String nombre) {
        this.nombre = nombre;
    }

    public void menu() {
        int opcion = 0;
        do {
            System.out.println("1- Nueva lavadora\n2- Nuevo TV\n7- Ver stock\n8- Calcular totales\n0- Salir");
            opcion = Lector.leer().nextInt();
            Lector.leer().nextLine();

            switch(opcion) {
                case 1:
                    nuevaLavadora();
                    break;
                case 2:
                    nuevoTelevisor();
                    break;
                case 7:
                    verElectrodomesticos();
                    break;
                case 8:
                    calcularPrecioFinalTotal();
                    break;
                case 0:
                    chau();
                    break;
                default:
                    System.out.println("¿O_ô?");
                    break;
            }
        } while(opcion != 0);
    }

    private void verElectrodomesticos() {
        for(ElectrodomesticoServicio e : stock) {
            System.out.println(e);
        }
    }

    private void calcularPrecioFinalTotal() {
        double totalElectros = 0, totalTeles = 0, totalLavadoras = 0;

        for(ElectrodomesticoServicio e : stock) {
            double precioFinal = e.precioFinal();

            if(e instanceof LavadoraServicio) {
                totalLavadoras += precioFinal;
            }

            if(e instanceof TelevisorServicio) {
                totalTeles += precioFinal;
            }

            totalElectros += precioFinal;
        }

        System.out.println("Total electros $" + totalElectros);
        System.out.println("Total TVs $" + totalTeles);
        System.out.println("Total lavadoras $" + totalLavadoras);
    }

    private void nuevoElectro() {
        ElectrodomesticoServicio es = new ElectrodomesticoServicio();
        es.crearElectrodomestico();
        stock.add(es);
    }

    private void nuevaLavadora() {
        LavadoraServicio ls = new LavadoraServicio();
        ls.crearLavadora();
        stock.add(ls);
    }

    private void nuevoTelevisor() {
        TelevisorServicio ts = new TelevisorServicio();
        ts.crearTelevisor();
        stock.add(ts);
    }

    private void chau() {
        System.out.println(nombre + " le dice 'hasta mañana' (?)");
    }

    public String getNombre() {
        return nombre;
    }
}
