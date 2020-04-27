/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.coursework;

/**
 *
 * @author andre
 */
public class controller {
    
    public void run() {
        boolean finished = false;
        do {
            System.out.println("Choose: /n");            
            char choice = displayMenu();
            switch (choice) {
                case 'A': 
                    addTrack();
                    break;
                case 'B': 
                    displayTracks();                                      
                    finished = true;
            }
        } while (!finished);
    }
    
     private char displayMenu() {
        InputHelper inputHelper = new InputHelper();
        System.out.print("\nA. Add a new track");
        System.out.print("\tB. Display Tracks");       
        return inputHelper.readCharacter("Enter choice", "A or B");
    }    
     
     private void addTrack() {
        InputHelper inputHelper = new InputHelper();
        String trackTitle = inputHelper.readString("Enter Track Title");
        String trackArtist = inputHelper.readString("Enter Track Artist");
        int trackLength = inputHelper.readInt("Enter track length", 20, 0); 
        String releaseDate = inputHelper.readString("Enter release date");
        String composer = inputHelper.readString("Enter Composer");
        String album = inputHelper.readString("Enter Album");
        String genre = inputHelper.readString("Enter Genre");
        Track newTrack = new Track(trackTitle, trackArtist, trackLength, releaseDate, composer, album, genre);     
         System.out.println("new track :" +newTrack);
    }
     
     private void displayTracks(){
         
     }
     
}
