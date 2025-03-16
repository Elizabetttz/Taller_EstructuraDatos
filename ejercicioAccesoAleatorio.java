import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
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

            RandomAccessFile accfile = new RandomAccessFile(archivo, "r");
            List<String> lineas = new ArrayList<>();
            String linea;
            Random random = new Random();

            
            while ((linea = accfile.readLine()) != null) {
                lineas.add(linea);
            }

            if(!lineas.isEmpty()){
                String randomlinea = lineas.get(random.nextInt(lineas.size()));
                System.out.println("Linea aleatoria:" + randomlinea );
            } else {
                System.out.println("El archivo esta vacio");
            }
            accfile.close();
        }
        catch (Exception e) {
            System.out.println("Error al crear o leer el archivo " + e);
        }
    }
}