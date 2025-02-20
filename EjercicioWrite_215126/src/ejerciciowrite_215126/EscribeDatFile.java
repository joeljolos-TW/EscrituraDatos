/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciowrite_215126;


import java.io.*;
import java.nio.file.Path;
public class EscribeDatFile {

    public static void main(String[] args) throws IOException {
        EscribeNums();
        LeeNumeros();
    }
    public static void EscribeNums() throws IOException{
        DataOutputStream ArchSalida = new DataOutputStream(new FileOutputStream("archivofilechannel.txt"));
        for(int i=0; i<10; i++){
            ArchSalida.writeInt(i);
            System.out.println("Salida"+i);
        }
        ArchSalida.close();
    }

    public static void LeeNumeros()throws IOException{
        DataInputStream ArcEntrada = new DataInputStream(new FileInputStream("archivofilechannel.txt"));
        while (ArcEntrada.available()>0) {
            int x= ArcEntrada.readInt();
            System.out.println("Entrada: "+x);            
        }
        ArcEntrada.close();
    }
}