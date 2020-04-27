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
public class Track {
    //variable declaration
    private final int trackId;
    private String trackTitle;
    private String artist;
    private int trackLength;
    private String releaseDate;
    private String composer;
    private String album;
    private String genre;
    
    //setting trackid to 0
    private static int lasttrackIdAllocated = 0;
    
    public Track next;
    
    //constructor
    public Track(String trackTitle, String artist, int trackLength, String releaseDate, String
            composer, String album, String genre) {
        this.trackId = lasttrackIdAllocated++;
        this.trackTitle = trackTitle;
        this.artist = artist;
        this.trackLength = trackLength;
        this.releaseDate = releaseDate;
        this.composer = composer;
        this.album = album;
        this.genre = genre; 
    }
    
    //display method
    public void display(){
        System.out.println("Title : " +trackTitle+ "Artist : " +artist+ "Length : " +trackLength+ 
                "Release date : " +releaseDate+ "Composer : " +composer+ "Album : " +album+ "Genre : "
                +genre);
    }
    
    
    //getters and setters
    public int getTrackId() {
        return this.trackId;
    }
    
    public String getTrackTitle() {
        return this.trackTitle;
    }
    
    public void setTrackTitle(String trackTitle) {
        this.trackTitle = trackTitle;
    }
    
    public String getArtist() {
        return this.artist;
    }
    
    public void setArtist(String artist) {
        this.artist = artist;
    }
    
    public int getTrackLength() {
        return this.trackLength;
    }
    
    public void setTrackLength(int trackLength) {
        this.trackLength = trackLength;
    }
    
    public String getReleaseDate() {
        return this.releaseDate;
    }
    
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
    
    public String getComposer() {
        return this.composer;
    }
    
    public void setComposer(String composer) {
        this.composer = composer;
    }
    
    public String getAlbum() {
        return this.album;
    }
    
    public void setAlbum(String album) {
        this.album = album;
    }
    
    public String getGenre() {
        return this.genre;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public static void main(String[] args){
        TrackList theTrackList = new TrackList();
        
        theTrackList.insertFirstTrack("a", "a", 3, "2/2/16", "a", "a", "a");
        theTrackList.insertFirstTrack("b", "b", 4, "3/2/16", "b", "b", "b");
        theTrackList.insertFirstTrack("c", "c", 5, "4/2/16", "c", "c", "c");
        
        theTrackList.display();
    }
}
