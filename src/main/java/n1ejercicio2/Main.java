package n1ejercicio2;

public class Main {

    public static void main(String[] args) {

        TrabajadorPresencial trabajador1 = new TrabajadorPresencial("Mario","Ramires",9,8);
        TrabajadorOnline trabajador2 = new TrabajadorOnline("Sara","Martin",9,8);

        System.out.println(trabajador1.calcularSueldo(trabajador1.getHorasTrabajadas()));
        System.out.println(trabajador2.calcularSueldo(trabajador2.getHorasTrabajadas()));

        System.out.println("Mi salario es : " + trabajador1.calcularSueldo());
        trabajador2.calcularSueldo();

    }
}
