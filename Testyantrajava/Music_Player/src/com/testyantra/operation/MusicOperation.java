package com.testyantra.operation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import com.testyantra.dao.MusicDAO;
import com.testyantra.dao.MusicDAOImpl;
import com.testyantra.music.bean.MusicBean;

public class MusicOperation {

	public static void main(String[] args) {
		MusicDAO mdi=new MusicDAOImpl();
		try {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String contine=null;
		do {
			System.out.println("Press 1 for Play Songs..");
			System.out.println("Press 2 for Search a song..");
			System.out.println("Press 3 for Show All the Songs..");
			System.out.println("Press 4 for Perform operation for songs");
			int choise=Integer.parseInt(input.readLine());
			switch (choise) {
			case 1:
				System.out.println("Press A for Play All songs");
				System.out.println("Press B for Play Random Song");
				System.out.println("Press C for Play Particular song");
				char choise1=input.readLine().charAt(0);
				switch (choise1) {
				case 'A':
					List<MusicBean> musicList=mdi.getAllMusic();
					for(MusicBean music:musicList) {
						System.out.println("SongId..:"+music.getSongId()+", Song Title..:"+music.getSongTitle()+", Artist Name..:"+music.getArtistName()+" ,Album Name..:"+music.getAlbumName()+" and Description..:"+music.getDescription());
					}
					break;
				case 'B':
					MusicBean music=mdi.getRandomMusic();
					System.out.println("SongId..:"+music.getSongId()+", Song Title..:"+music.getSongTitle()+", Artist Name..:"+music.getArtistName()+" ,Album Name..:"+music.getAlbumName()+" and Description..:"+music.getDescription());
					break;
				case 'C':
					System.out.println("Enter Music title");
					String particularSong=input.readLine();
					MusicBean music1=mdi.getParticularMusic(particularSong);
					System.out.println("SongId..:"+music1.getSongId()+", Song Title..:"+music1.getSongTitle()+", Artist Name..:"+music1.getArtistName()+" ,Album Name..:"+music1.getAlbumName()+" and Description..:"+music1.getDescription());
					break;
				default:
					System.out.println("Invalid Option.");
					break;
				}
				break;
			case 2:
				System.out.println("Enter Song to Search");
				String songToSearch=input.readLine();
				MusicBean music1=mdi.getParticularMusic(songToSearch);
				System.out.println("SongId..:"+music1.getSongId()+", Song Title..:"+music1.getSongTitle()+", Artist Name..:"+music1.getArtistName()+" ,Album Name..:"+music1.getAlbumName()+" and Description..:"+music1.getDescription());
				break;
			case 3:
				List<MusicBean> musicList=mdi.getAllMusic();
				for(MusicBean music:musicList) {
					System.out.println("SongId..:"+music.getSongId()+", Song Title..:"+music.getSongTitle()+", Artist Name..:"+music.getArtistName()+" ,Album Name..:"+music.getAlbumName()+" and Description..:"+music.getDescription());
				}
				break;
			case 4:
				System.out.println("Press A for Insert a song.");
				System.out.println("Press B for Edit a song.");
				System.out.println("Press C for Delete a Song.");
				char choise2=input.readLine().charAt(0);
				MusicBean musicBean=new MusicBean();
				switch (choise2) {
				case 'A':
					System.out.println("Enter Song Id.");
					musicBean.setSongId(Integer.parseInt(input.readLine()));
					System.out.println("Enter Song Title");
					musicBean.setSongTitle(input.readLine());
					System.out.println("Enter Album name.");
					musicBean.setAlbumName(input.readLine());
					System.out.println("Enter Artist Name.");
					musicBean.setArtistName(input.readLine());
					System.out.println("Enter Song location.");
					musicBean.setSongLocation(input.readLine());
					System.out.println("Enter Description.");
					musicBean.setDescription(input.readLine());
					mdi.addSong(musicBean);
					break;
                case 'B':
                	System.out.println("Enter Song Id to update");
                	musicBean.setSongId(Integer.parseInt(input.readLine()));
                	System.out.println("Enter New Song Title ");
                	musicBean.setSongTitle(input.readLine());
                	mdi.updateSong(musicBean);
                	break;
                case 'C':
                	System.out.println("Enter Song Id to delete.");
                	mdi.deleteSong(Integer.parseInt(input.readLine()));
                	break;
				default:
					System.out.println("Invalid Choise");
					break;
				}
				break;

			default:
				System.out.println("Invalid Option");
				break;
			}
			
			System.out.println("Press Y for continue and Press N for Exit");
			contine=input.readLine();
			if(contine.charAt(0)=='N') {
				break;
			}
		}while(contine.charAt(0)=='Y'||contine.charAt(0)=='y');
		}catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
