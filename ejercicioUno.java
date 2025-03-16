import java.io.*;

public class ejercicioUno {
    public static void main(String[] args) {
        try {
            File archivo = new File("Archivo.txt");
            FileWriter escritura = new FileWriter(archivo);
            escritura.write("Linea 1: Este es el primer dato");
            escritura.write("\n Linea 2: Este es el segundo dato");
            
            escritura.close();
            if(archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
            }
            else {
                System.out.println("El archivo ya existe");
            }
        }
        catch (Exception e) {
            System.out.println("Error al crear el archivo " + e);
        }
    }
}