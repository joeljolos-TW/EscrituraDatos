/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciowrite_215126;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.*;

/**
 *
 * @author labo
 */
public class EscribeTXTByte {
    
    public static void main(String[] args) throws IOException {
        EscribeFileChannel(ByteBuffer.wrap("QUE CHINGUE A SU MADRE EL AMERICA".getBytes()));
        LeeFileChannel();
        LeeDatosDat();
    }
    public static void LeeFileChannel() throws IOException{
        RandomAccessFile raf = new RandomAccessFile("archivofilechannel.txt","rw");
        FileChannel fileChannel = raf.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(512);
        
        Charset charset=Charset.forName("US-ASCII");
        while(fileChannel.read(byteBuffer)>0){
            System.out.println(charset.decode(byteBuffer));
            byteBuffer.flip();
        }
        fileChannel.close();
        raf.close();
    }
    
    public static void EscribeFileChannel(ByteBuffer byteBuffer)throws IOException{
        Set<StandardOpenOption>options = new HashSet<>();
        options.add(StandardOpenOption.CREATE);
        options.add(StandardOpenOption.APPEND);
        Path path = Paths.get("archivofilechannel.dat");
        FileChannel fileChannel = FileChannel.open(path, options);
        fileChannel.write(byteBuffer);
        fileChannel.close();
    }
    
    public static void LeeDatosDat()throws IOException{
        String[] lineas = Files.readAllLines(new File("archivofilechannel.dat").
                toPath()).toArray(new String[0]);
        
        for(String linea: lineas){
            System.out.println("impresion de dat");
            System.out.println(linea);
        }
        
    }
}
