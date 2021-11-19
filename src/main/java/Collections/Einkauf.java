package Collections;

import java.util.Objects;

public class Einkauf {

    private String name;
    private double preis;

    public Einkauf(String name, double preis){
        this.name = name;
        this.preis = preis;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Einkauf einkauf = (Einkauf) o;
        return Double.compare(einkauf.preis, preis) == 0 && Objects.equals(name, einkauf.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, preis);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Einkauf{" +
                "name='" + name + '\'' +
                ", preis=" + preis +
                '}';
    }

    public double getPreis() {
        return preis;
    }
}
