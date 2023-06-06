package n2ejercicio1;

@JsonSerializable
public record Persona(String nombre, int edad) {
    @JsonSerializable
    public String toString() {
        return nombre + " " + edad;
    }
}
