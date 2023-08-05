/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spotify12;

/**
 *
 * @author XPC
 */
public class Cancion {
    //Zona donde se establecen la variables dependiendo de su uso
    public int idSong;
    public String tittleSong;
    public String singer;
    public double duration;
    public int yearSong;
    public int actualYear = 2023;
    public double largerSong = 0; 
    public String tittleSongLarge ="";
    

    
    // Un constructor el cual se utilizara en la matriz 
    public Cancion(int idSong, String tittleSong, String singer, double duration, int yearSong) {
        this.idSong = idSong;
        this.tittleSong = tittleSong;
        this.singer = singer;
        this.duration = duration;
        this.yearSong = yearSong;
    }
    // Getters y Setters 
    public int getIdSong() {
        return idSong;
    }

    public void setIdSong(int idSong) {
        this.idSong = idSong;
    }

    public String getTittleSong() {
        return tittleSong;
    }

    public void setTittleSong(String tittleSong) {
        this.tittleSong = tittleSong;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public int getYearSong() {
        return yearSong;
    }

    public void setYearSong(int yearSong) {
        this.yearSong = yearSong;
    }

    public int getActualYear() {
        return actualYear;
    }

    public void setActualYear(int actualYear) {
        this.actualYear = actualYear;
    }

    public double getLargerSong() {
        return largerSong;
    }

    public void setLargerSong(double largerSong) {
        this.largerSong = largerSong;
    }

    public String getTittleSongLarge() {
        return tittleSongLarge;
    }

    public void setTittleSongLarge(String tittleSongLarge) {
        this.tittleSongLarge = tittleSongLarge;
    }

    
}
  
    
    
    
         
    

