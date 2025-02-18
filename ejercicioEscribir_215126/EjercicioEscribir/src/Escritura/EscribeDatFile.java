package Escritura;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
public class EscribeDatFile {

    public static void main(String[] args) {
        
    }
    public static void EscribeNums() throws IOException{
        DataOutputStream ArchSalida = new DataOutputStream(new FileOutputStream(""));
        for(int i=0; i<10; i++){
            ArchSalida.writeInt(i);
            System.out.println("Salida");
        }
        ArchSalida.close();
    }

    public static void LeeNumeros()throws IOException{
        DataOutputStream ArcEntrada = new DataOutputStream(new FileOutputStream(""));
        while (ArcEntrada.available()>0) {
            int x= ArcEntrada.readInt();
            System.out.println("Entrada: "+x);            
        }
        ArcEntrada.close();
    }
}