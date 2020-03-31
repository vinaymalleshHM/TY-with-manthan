package com.testyantra.dao;

import java.util.ArrayList;

import com.testyantra.music.MusicFilesInfoBean;

public interface MusicFDAO {
	
	ArrayList playSong() ;
	MusicFilesInfoBean searchSong(String search) ;
	boolean operationOnAddDB(MusicFilesInfoBean musicFilesInfoBean);
	boolean operationOnUpDB(MusicFilesInfoBean musicFilesInfoBean);
	boolean operationOnDelDB(MusicFilesInfoBean musicFilesInfoBean);
	
	

}
