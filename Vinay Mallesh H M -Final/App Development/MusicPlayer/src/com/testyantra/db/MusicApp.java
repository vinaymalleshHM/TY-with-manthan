package com.testyantra.db;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

import com.testyantra.dao.MusicFDAO;
import com.testyantra.dao.MusicFDAOImpl;
import com.testyantra.music.MusicFilesInfoBean;

public class MusicApp {
	public static void main(String[] args) {

		MusicFDAO dao = new MusicFDAOImpl();

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Your Input\n 1 to Play a Song\n 2 to Search Song\n 3 to Show All Song\n 4 to Operate on Songs Database ");
		int input=sc.nextInt();


		switch (input) {
		case 1:Scanner sc1 = new Scanner(System.in);
		System.out.println("Please Enter Your Input to \n A to Play all Song\n B Play song Randomly\n C Play a Particular Song");
		String s = sc1.next();
		if (s.equalsIgnoreCase("A")) {
			ArrayList<String> al= dao.playSong();
			Collections.sort(al);
			for (String string : al) {
				System.out.println(string);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		else if (s.equalsIgnoreCase("B")) {

			ArrayList<String> al= dao.playSong();
			Collections.shuffle(al,new Random());
			for (String string : al) {
				System.out.println(string);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		else if (s.equalsIgnoreCase("C")) {

			Scanner sc2 = new Scanner(System.in);
			System.out.println("Enter Your Song");
			String music = sc2.next();
			MusicFilesInfoBean musicFilesInfoBean = dao.searchSong(music);
			if (musicFilesInfoBean!=null) {

				System.out.println("Song Id:"+musicFilesInfoBean.getSong_ID());
				System.out.println("Song Name:"+musicFilesInfoBean.getSong_Title());
				System.out.println("Song Artist:"+musicFilesInfoBean.getArtist_Name());
				System.out.println("Song Album:"+musicFilesInfoBean.getAlbum_Name());
				System.out.println("Song Location:"+musicFilesInfoBean.getSong_Location());
				System.out.println("Song Location:"+musicFilesInfoBean.getDescription());

			}

		}
		else {
			System.out.println("Invalid Input");
		}

		break;

		case 2:if(input==2) {
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Enter Your Song");
			String music = sc2.next();
			MusicFilesInfoBean musicFilesInfoBean = dao.searchSong(music);
			if (musicFilesInfoBean!=null) {
				System.out.println("Song Id:"+musicFilesInfoBean.getSong_ID());
				System.out.println("Song Name:"+musicFilesInfoBean.getSong_Title());
				System.out.println("Song Artist:"+musicFilesInfoBean.getArtist_Name());
				System.out.println("Song Album:"+musicFilesInfoBean.getAlbum_Name());
				System.out.println("Song Location:"+musicFilesInfoBean.getSong_Location());
				System.out.println("Song Location:"+musicFilesInfoBean.getDescription());

			}

		}

		break;
		case 3:if(input==3) {

			ArrayList<String> al= dao.playSong();
			Collections.sort(al);
			for (String string : al) {
				System.out.println(string);
			}

		}

		break;
		case 4:if(input==4) {
			Scanner sc3 = new Scanner(System.in);
			System.out.println("Please Enter Your Input\n A to Add Song\n B to Edit an Existing Song\n C to delete an Existing Song");
			String add = sc3.next();

			String desciption= sc3.next();

			if(add.equalsIgnoreCase("A")) {
				MusicFilesInfoBean	musicFilesInfoBean = new MusicFilesInfoBean();
				Scanner sc4 = new Scanner(System.in);
				System.out.println(" Enter song ID");
				int ID= sc4.nextInt();
				System.out.println(" Enter song Name");
				String Name= sc4.next();
				System.out.println(" Enter song Artist");
				String Artist= sc4.next();
				System.out.println(" Enter song Album");
				String Album= sc4.next();
				System.out.println(" Enter song Location");
				String Location= sc4.next();
				System.out.println(" Enter song desciption");

				musicFilesInfoBean.setSong_ID(ID);
				musicFilesInfoBean.setSong_Title(Name);
				musicFilesInfoBean.setArtist_Name(Artist);
				musicFilesInfoBean.setAlbum_Name(Album);
				musicFilesInfoBean.setSong_Location(Location);
				musicFilesInfoBean.setDescription(desciption);
				boolean a = dao.operationOnAddDB(musicFilesInfoBean);
				if(a) {
					System.out.println("song added succufully");
				}
				else {
					System.out.println("song  not added");
				}
			}
			else if(add.equalsIgnoreCase("B")) {
				MusicFilesInfoBean	musicFilesInfoBean = new MusicFilesInfoBean();
				Scanner sc5 = new Scanner(System.in);
				System.out.println(" Enter song ID");
				int ID= sc5.nextInt();
				System.out.println(" Enter song Name");
				String Name= sc5.next();

				musicFilesInfoBean.setSong_ID(ID);
				musicFilesInfoBean.setSong_Title(Name);

				boolean a = dao.operationOnUpDB(musicFilesInfoBean);
				if(a) {
					System.out.println("song deleted succufully");
				}
				else {
					System.out.println("song  not deleted");
				}
			}

			else if(add.equalsIgnoreCase("C")) {
				MusicFilesInfoBean	musicFilesInfoBean = new MusicFilesInfoBean();
				Scanner sc6 = new Scanner(System.in);
				System.out.println(" Enter song ID");
				int ID= sc6.nextInt();


				musicFilesInfoBean.setSong_ID(ID);

				boolean a = dao.operationOnDelDB(musicFilesInfoBean);
				if(a) {
					System.out.println("song updated succufully");
				}
				else {
					System.out.println("song  not updated");
				}
			}
		}
		break;

		default: System.out.println("Invalid Input");
		break;













		}
	}//end of main
}	//end of class
