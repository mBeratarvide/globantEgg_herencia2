package servicios;

import entidades.Electrodomestico;

public class ElectrodomesticoServicio {
    private final Electrodomestico e = new Electrodomestico();

    public Electrodomestico crearElectrodomestico() {
        // precio
        e.setPrecio(1000);

        // color
        System.out.println("Qué color tiene?");
        e.setColor(Lector.leer().nextLine());

        // consumo
        System.out.println("Cuál es el nivel de consumo energético?");
        e.setConsumoEnergetico(Lector.leer().nextLine().charAt(0));

        // peso
        System.out.println("Cuánto pesa?");
        e.setPeso(Lector.leer().nextDouble());
        Lector.leer().nextLine();

        return e;
    }

    public double precioFinal() {
        // arranco con el precio base
        double total = e.getPrecio();

        // consumo energético
        switch(e.getConsumoEnergetico()) {
            case 'A':
                total += 1000;
                break;
            case 'B':
                total += 800;
                break;
            case 'C':
                total += 600;
                break;
            case 'D':
                total += 500;
                break;
            case 'E':
                total += 300;
                break;
            default:
                total += 100;
                break;
        }

        // peso
        if(e.getPeso() < 20) {
            total += 100;
        } else if(e.getPeso() < 50) {
            total += 500;
        } else if(e.getPeso() < 80) {
            total += 800;
        } else {
            total += 1000;
        }

        //System.out.println("Precio final: $" + total);
        return total;
    }

    @Override
    public String toString() {
        return e.toString() + " > precio final $" + precioFinal();
    }
}
