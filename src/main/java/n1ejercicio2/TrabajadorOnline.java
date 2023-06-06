package n1ejercicio2;

public class TrabajadorOnline extends Trabajador {

    private final int tarifaPlanaInternet = 30;
    private int horasTrabajadas;

    public TrabajadorOnline(String nombre, String apellido, int precioHora, int horasTrabajadas) {
        super(nombre, apellido, precioHora);
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    @Override
    String calcularSueldo(int horasTrabajadas) {

        return super.toString() + " mi salario es " + (tarifaPlanaInternet + (super.precioHora * horasTrabajadas));
    }

    @Deprecated
    public void calcularSueldo(){
        System.out.println("Mi salario es " + super.precioHora * horasTrabajadas);
    }

}
