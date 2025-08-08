import java.util.*;

public class Traductor {
    public static void main(String[] args) {
        // Diccionario por HashMap para introducir datos clave-valor
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("Error", "Error");
        diccionario.put("Base de datos", "Database");
        diccionario.put("Consulta", "Query");
        diccionario.put("Tabla", "Table");
        diccionario.put("Columna", "Column");
        diccionario.put("Fila", "Row");
        diccionario.put("Clave", "Key");
        diccionario.put("Clave primaria", "Primary Key");
        diccionario.put("Clave foránea", "Foreign Key");
        diccionario.put("Índice", "Index");
        diccionario.put("Registro", "Record");
        diccionario.put("Campo", "Field");
        diccionario.put("Unión", "Join");
        diccionario.put("Filtro", "Filter");
        diccionario.put("Ordenar", "Sort");
        diccionario.put("Actualizar", "Update");
        diccionario.put("Eliminar", "Delete");
        diccionario.put("Insertar", "Insert");
        diccionario.put("Sentencia", "Statement");
        diccionario.put("Esquema", "Schema");
        diccionario.put("Restricción", "Constraint");

        // Conversión de claves a lista para consultar
        List<String> claves = new ArrayList<>(diccionario.keySet());
        // Mezcla aleatoriamente las palabras clave
        Collections.shuffle(claves);

        // Se inicializan los contadores en 0
        int correctas = 0;
        int incorrectas = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Traduce las siguientes palabras a español");

        // Bucle para asignar y pedir las palabras correspondientes
        for(int i = 0; i < 5; i++){
            // Seleccion de palabras de la lista con las del diccionario
            String palabraEsp = claves.get(i);
            String traduccionCorrecta = diccionario.get(palabraEsp);

            System.out.print("Traduce '" + palabraEsp + "' al inglés: ");
            // Introduccion de traducción
            String respuesta = sc.nextLine().trim();

            // Comparacion y conteo de palabras correctas e incorrectas.
            if (respuesta.equalsIgnoreCase(traduccionCorrecta)) {
                System.out.println("Correcto!");
                correctas++;
            } else {
                System.out.println("Incorrecto!. La respuesta correcta es: " + traduccionCorrecta);
                incorrectas++;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Respuestas correctas: " + correctas);
        System.out.println("Respuestas incorrectas: " + incorrectas);
    }


}
