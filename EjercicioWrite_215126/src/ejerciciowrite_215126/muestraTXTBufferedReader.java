/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciowrite_215126;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
 /*
 * @author labo
 */
public class muestraTXTBufferedReader {
    public static void main(String[] args) {
        String str = " ";
        String ArchivoTrabajo="Archivo2.txt";
        char[] chars = new char[100];
        
        try(BufferedReader buff = new BufferedReader(new FileReader(new File(ArchivoTrabajo)),4096)){
            System.out.println("imprime 100 CHARS");
            buff.read(chars);
            System.out.println(Arrays.toString(chars));
            
            Arrays.fill(chars, ' ');
            
            System.out.println("IMPRIME LOS 20 PRIMEROS CHARS");
            buff.read(chars, 10, 20);
            System.out.println(Arrays.toString(chars));
            
            System.out.println("imprime lineaxlinea");
            while((str= buff.readLine())!=null)
                System.out.println(str);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
  
}
