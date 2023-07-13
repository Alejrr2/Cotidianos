/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerpractico;

/**
 *
 * @author alejh
 */
public class EjerPractico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Spotify user = new Spotify ();
        user.setAuthor("Ale");
        System.out.println(user.getAuthor());
        user.setDuration(2.14);
        System.out.println(user.getDuration());
        user.setIdSong(12456);
        System.out.println(user.getIdSong());
        user.setTitle("gasolina");
        System.out.println(user.getTitle());
        user.setYearCreation(2007);
        System.out.println(user.getYearCreation());
        
        
        
        
                
    }
    
}
