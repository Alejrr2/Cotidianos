/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package spotify12;
import javax.swing.JOptionPane;
/**
 *
 * @author XPC
 */
public class Spotify12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Desarrollo del problema
        //En primer paso se hace la creacion del arreglo
            Cancion Arreglo[]  = new Cancion[10];
            //Con este for se procede a ingresar los datos dentro del arreglo 
            for(int x=0; x<10; x++){
                JOptionPane.showMessageDialog(null, "Se solicitarán los datos de las canciones "+(x+1));
                int idSong = Integer.parseInt(JOptionPane.showInputDialog(null,"Escriba el Id de la cancion:"));
                String tittleSong = JOptionPane.showInputDialog("Escriba el nombre de la cancion:");
                String singer = JOptionPane.showInputDialog("Escriba el nombre del autor");
                double duration = Double.parseDouble(JOptionPane.showInputDialog(null, "Escriba la duracion de la cancion:"));
                int yearSong = Integer.parseInt(JOptionPane.showInputDialog(null,"Escriba el año de la cancion:"));
                Arreglo[x]= new Cancion(idSong,tittleSong,singer,duration,yearSong);
                if (Arreglo[x].getDuration() > Arreglo[0].getLargerSong()){
                    Arreglo[0].setLargerSong(Arreglo[x].getDuration());
                    Arreglo[0].setTittleSongLarge(Arreglo[x].getTittleSong()); 
                    }}
            //Cracion de codigo para la impresion de las canciones anterios al año actual
            JOptionPane.showMessageDialog( null, "Canciones que salieron antes al anio actual");
            for(int x=0; x<10; x++){
                 Cancion Datos = Arreglo[x];
                if (Datos.getYearSong() < Datos.getActualYear()){
                    JOptionPane.showMessageDialog(null,Datos.getTittleSong());
                }}
            //Cracion de codigo para la impresion de las canciones que salieron en el año actual(2023(esta variable se pued cambiar en la zona de getter y setters)).
            JOptionPane.showMessageDialog( null, "Canciones que salieron en al anio actual");
            for(int x=0; x<10; x++){
                 Cancion Datos = Arreglo[x];
                if (Datos.getYearSong() == Datos.getActualYear()){
                    JOptionPane.showMessageDialog(null,Datos.getTittleSong());
                }}
            //Creacion de las canciones que saldran posterior al año actual
            JOptionPane.showMessageDialog( null, "Canciones posteriores al anio actual");
            for(int x=0; x<10; x++){
                 Cancion Datos = Arreglo[x];
                if (Datos.getYearSong() > Datos.getActualYear()){
                    JOptionPane.showMessageDialog(null,Datos.getTittleSong());
                }}
            // Creamos el codigo para determinar cual es la cancion de mayor duracion 
            JOptionPane.showMessageDialog(null,"La canción de mayor duración es : " + Arreglo[0].getTittleSongLarge());
            // Creacion del codigo para determinar cual es la cancion en la primera posicion (se hace un llamado en la primera linea del cantante)
            for (int x = 0; x < 1; x++) {
            JOptionPane.showMessageDialog( null, "El autor de la cancion en primera posicion es: "+ Arreglo[0].getSinger()); }
            //Creacion del codigo para que imprima cuales son todas las canciones 
            JOptionPane.showMessageDialog( null, "Lista de las canciones");
                for (int x = 0; x < 10; x++) {
                    Cancion Datos = Arreglo[x];
                    JOptionPane.showMessageDialog( null, "Nombre de la cancion "+(x+1)+": "+Datos.getTittleSong());
        }
        }
        }
            

    
    

