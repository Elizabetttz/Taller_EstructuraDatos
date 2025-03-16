import java.io.*;

public class ejercicioAccesoSec{
    public static void main(String[] args){
        String nombreArchivo = "Archivo.txt";
        String buscar = "Linea 1: Este es el primer dato";
        boolean confi = false;

        try ( BufferedReader lec = new BufferedReader(new FileReader(nombreArchivo))){
            String linea1;
            while((linea1 = lec.readLine()) != null){
                if (linea1.contains(buscar)){
                    System.out.println("Se encontró: " + linea1);
                    confi = true;
                    break;
                }
            }

            if(!confi){
                System.out.println("No se encontró");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}