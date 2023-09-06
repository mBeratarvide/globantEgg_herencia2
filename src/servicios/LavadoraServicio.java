package servicios;

import entidades.Electrodomestico;
import entidades.Lavadora;

public class LavadoraServicio extends ElectrodomesticoServicio {
    private final Lavadora l = new Lavadora();

    public void crearLavadora() {
        Electrodomestico e = crearElectrodomestico();
        l.setColor(e.getColor());
        l.setPrecio(e.getPrecio());
        l.setPeso(e.getPeso());
        l.setConsumoEnergetico(e.getConsumoEnergetico());

        System.out.println("De cuántos Kg es la carga?");
        l.setCarga(Lector.leer().nextDouble());
        Lector.leer().nextLine();

        //return l;
    }

    @Override
    public double precioFinal() {
        double total = super.precioFinal();

        if(l.getCarga() > 30) {
            total += 500;
        }

        return total;
    }

    @Override
    public String toString() {
        return l.toString() + " > precio final $" + this.precioFinal();
    }
}
