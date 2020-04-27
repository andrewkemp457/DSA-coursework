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
public class TrackList {
    
    public Track firstTrack;
    
    TrackList(){
        
        firstTrack = null;
        
    }
    
    public boolean isEmpty(){
        
        return(firstTrack == null);
        
    }
    
    public void insertFirstTrack (String trackTitle, String artist, int trackLength, String releaseDate, String
            composer, String album, String genre){
        
        Track newTrack = new Track(trackTitle, artist, trackLength, releaseDate, composer, album, genre);
        
        newTrack.next = firstTrack;
        
        firstTrack = newTrack;
        
    }
    
     public void display(){
        
         Track theTrack = firstTrack;


        while(theTrack != null){

            theTrack.display();
            
            System.out.println("Next Track: " + theTrack.next);
            
            theTrack = theTrack.next;
            
            System.out.println();
        }
     }
    
    public Track searchByTitle(String trackTitle){
        
        Track selectedTrack = firstTrack;
        
        if(!isEmpty()){
            while (selectedTrack.getTrackTitle() != trackTitle)
                
                if (selectedTrack.next == null){
                    return null;
                }
                else{
                    selectedTrack = selectedTrack.next;
                }
                   
        }
        else{
            System.out.println("no match found");
        }
        return selectedTrack;
    }
    
    public Track searchByArtist(String trackArtist){
        
        Track selectedTrack = firstTrack;
        
        if(!isEmpty()){
            while (selectedTrack.getArtist() != trackArtist)
                
                if (selectedTrack.next == null){
                    return null;
                }
                else{
                    selectedTrack = selectedTrack.next;
                }
                   
        }
        else{
            System.out.println("no match found");
        }
        return selectedTrack;
    }
}
