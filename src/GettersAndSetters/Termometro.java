package GettersAndSetters;

public class Termometro {

    private double celsius;

    public Termometro() {
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double temperatura) {
        if (temperatura >= -273.15) {
            this.celsius = temperatura;
        } else {
            System.out.println("La temperatura no puede ser menor al cero absoluto.");
            this.celsius = -273.15;
        }
    }

    public double getFahrenheit() {
        return (celsius * 9.0 / 5.0) + 32;
    }
}