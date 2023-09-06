package entidades;

import java.util.Objects;

public class Televisor extends Electrodomestico {
    private int pulgadas;
    private boolean sintonizadorTDT;

    public Televisor() {}

    public Televisor(double precio, String color, char consumoEnergetico, double peso, int pulgadas, boolean sintonizadorTDT) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public String toString() {
        String tieneSintonizadorTDT = "no";
        if(sintonizadorTDT) {
            tieneSintonizadorTDT = "si";
        }
        return "Televisor{ " +
                "pulgadas: " + pulgadas + "\"" +
                ", sintonizadorTDT: " + tieneSintonizadorTDT +
                ", " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Televisor televisor = (Televisor) o;
        return pulgadas == televisor.pulgadas && sintonizadorTDT == televisor.sintonizadorTDT;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pulgadas, sintonizadorTDT);
    }
}
