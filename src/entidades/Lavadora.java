package entidades;

import java.util.Objects;

public class Lavadora extends Electrodomestico {
    private double carga;

    public Lavadora() {}

    public Lavadora(double precio, String color, char consumoEnergetico, double peso, double carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "carga: " + carga + "Kg" +
                ", " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Lavadora lavadora = (Lavadora) o;
        return Double.compare(carga, lavadora.carga) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), carga);
    }
}
