package servicios;

import entidades.Electrodomestico;
import entidades.Televisor;

public class TelevisorServicio extends ElectrodomesticoServicio {
    private final Televisor t = new Televisor();

    public void crearTelevisor() {
        Electrodomestico e = crearElectrodomestico();
        t.setColor(e.getColor());
        t.setPrecio(e.getPrecio());
        t.setPeso(e.getPeso());
        t.setConsumoEnergetico(e.getConsumoEnergetico());

        System.out.println("De cuántas pulgadas es?");
        t.setPulgadas(Lector.leer().nextInt());
        Lector.leer().nextLine();

        System.out.println("Tiene sintonizador TDT? s/N");
        String tiene = Lector.leer().nextLine();
        t.setSintonizadorTDT(false);
        if(tiene.equalsIgnoreCase("si") || tiene.equalsIgnoreCase("s")) {
            t.setSintonizadorTDT(true);
        }

        //return t;
    }

    @Override
    public double precioFinal() {
        double total = super.precioFinal();

        if(t.getPulgadas() > 40) {
            total += total * 0.3;
        }

        if(t.isSintonizadorTDT()) {
            total += 500;
        }

        return total;
    }

    @Override
    public String toString() {
        return t.toString() + " > precio final $" + this.precioFinal();
    }
}
