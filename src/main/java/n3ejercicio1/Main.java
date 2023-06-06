package n3ejercicio1;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Jose Alberto", 23);

        // Leer la anotación JsonSerializable utilizando Reflection
        Class<?> personaClass = persona.getClass();
        Annotation[] annotations = personaClass.getAnnotations();

        for (Annotation annotation : annotations) {
            if (annotation instanceof JsonSerializable jsonSerializable) {
                String directory = jsonSerializable.directory();
                System.out.println("Directorio: " + directory);
            }
        }
    }
}
