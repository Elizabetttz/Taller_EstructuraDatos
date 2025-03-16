import java.io.*;

public class EjercicioDos {
    public static void main(String[] args) {
        try (BufferedReader lectura = new BufferedReader(new FileReader("Archivo.txt"))) {
            String linea;
            while ((linea = lectura.readLine()) != null) { 
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}