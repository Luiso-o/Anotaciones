package n3ejercicio1;

@JsonSerializable
public class Persona {

    private final String nombre;
    private final int edad;


    public Persona(String nombre,int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

}