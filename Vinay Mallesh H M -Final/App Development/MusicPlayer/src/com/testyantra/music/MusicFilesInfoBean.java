package com.testyantra.music;

public class MusicFilesInfoBean {
	
	int song_ID;
	String Song_Title;
	String artist_Name;
	String  album_Name;
	String song_Location;
	String description;
	public int getSong_ID() {
		return song_ID;
	}
	public void setSong_ID(int song_ID) {
		this.song_ID = song_ID;
	}
	public String getSong_Title() {
		return Song_Title;
	}
	public void setSong_Title(String song_Title) {
		Song_Title = song_Title;
	}
	public String getArtist_Name() {
		return artist_Name;
	}
	public void setArtist_Name(String artist_Name) {
		this.artist_Name = artist_Name;
	}
	public String getAlbum_Name() {
		return album_Name;
	}
	public void setAlbum_Name(String album_Name) {
		this.album_Name = album_Name;
	}
	public String getSong_Location() {
		return song_Location;
	}
	public void setSong_Location(String song_Location) {
		this.song_Location = song_Location;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
