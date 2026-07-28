package Encapsulacion;

public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public boolean esValida() {

        if (dia >= 1 && dia <= 31 &&
                mes >= 1 && mes <= 12 &&
                anio > 0) {

            return true;
        }

        return false;
    }

    public void mostrar() {

        System.out.println(dia + "/" + mes + "/" + anio);

        if (esValida()) {
            System.out.println("Fecha valida.");
        } else {
            System.out.println("Fecha invalida.");
        }
    }
}