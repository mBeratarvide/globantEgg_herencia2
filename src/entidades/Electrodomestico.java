package entidades;

import enumerados.Color;
import enumerados.ConsumoEnergetico;

import java.util.Objects;

public class Electrodomestico {
    private double precio;
    private Color color;
    private ConsumoEnergetico consumoEnergetico;
    private double peso;

    public Electrodomestico() {}

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    private Color comprobarColor(String color) {
        for(Color c : Color.values()) {
            if(c.name().equalsIgnoreCase(color)) {
                return c;
            }
        }
        return Color.BLANCO;
    }

    private ConsumoEnergetico comprobarConsumoEnergetico(char consumo) {
        for(ConsumoEnergetico ce : ConsumoEnergetico.values()) {
            if(ce.name().toLowerCase().charAt(0) == Character.toLowerCase(consumo)) {
                return ce;
            }
        }
        return ConsumoEnergetico.F;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color.name();
    }

    public void setColor(String color) {
        this.color = comprobarColor(color);
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico.name().charAt(0);
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "precio $" + precio +
                ", color: " + color +
                ", consumo energético: " + consumoEnergetico +
                ", peso: " + peso + "Kg }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Electrodomestico that = (Electrodomestico) o;
        return Double.compare(precio, that.precio) == 0 && Double.compare(peso, that.peso) == 0 && color == that.color && consumoEnergetico == that.consumoEnergetico;
    }

    @Override
    public int hashCode() {
        return Objects.hash(precio, color, consumoEnergetico, peso);
    }
}
