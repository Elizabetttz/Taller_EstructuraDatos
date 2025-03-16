import java.io.*;
public class ejercicioAccesoAleatorio {

    public static void main(String[] args) {
        try {
            int numero = 10;
            File archivo = new File("ArchivoAccesoAleatorio.txt");
            FileWriter escritura = new FileWriter(archivo);
            for(int i = 0; i < numero; i++){
                escritura.write("\n Linea: " + (i+1) + ": Este es el dato " + (i+1));
            }
            escritura.close();
        }
        catch (Exception e) {
            System.out.println("Error al crear el archivo " + e);
        }
    }
}