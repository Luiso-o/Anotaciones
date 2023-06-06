package n1ejercicio2;

public class TrabajadorPresencial extends Trabajador {

    private static int gasolina = 50;

    private int horasTrabajadas;

    public TrabajadorPresencial(String nombre, String apellido, int precioHora, int horasTrabajadas) {
        super(nombre, apellido, precioHora);
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    @Override
    String calcularSueldo(int horasTrabajadas) {

        return super.toString() + " mi salario es : " + (gasolina + (super.precioHora * horasTrabajadas));
    }

    @Deprecated
    public int calcularSueldo(){
        return super.precioHora * horasTrabajadas;
    }

}
