package n1ejercicio2;

public abstract class Trabajador {

    protected String nombre;
    protected String apellido;
    protected int precioHora;

    public Trabajador(String nombre, String apellido, int precioHora) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.precioHora = precioHora;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getPrecioHora() {
        return precioHora;
    }

    abstract String calcularSueldo(int horasTrabajadas);

    @Override
    public String toString() {
        return " mi nombre es : " + nombre + " " + apellido;
    }
}
