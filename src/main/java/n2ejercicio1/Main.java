package n2ejercicio1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

    public static void main(String[] args) {
        // Configurar el objeto Gson
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Persona persona = new Persona("Martha Gonzales", 25);

        // Convertir el objeto Persona a JSON
        String personaJson = gson.toJson(persona);

        // Imprimir el JSON resultante
        System.out.println(personaJson);
    }
}

