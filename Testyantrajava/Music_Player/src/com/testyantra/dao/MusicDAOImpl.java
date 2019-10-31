package com.testyantra.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import com.testyantra.music.bean.MusicBean;

public class MusicDAOImpl implements MusicDAO{
	Connection conn=null;
	ResultSet rs=null;
	String queryToGetAllRec=null;
	String queryToPlayRandomSong=null;
	String queryToPlayParticularSong=null;
	String queryToInsertSong=null;
	String queryToUpdateSong=null;
	String queryToDeleteSong=null;
	public MusicDAOImpl() {
		try {
			//Load the Driver class.
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Diver class loaded..");
			
			//Get the Db Conncetion.
			String filePath="C:\\Users\\admin\\Desktop\\db.properties";
			FileReader reader=new FileReader(filePath);
			Properties prop=new Properties();
			prop.load(reader);
			
			String dbUrl=prop.getProperty("dbUrl");
			String user=prop.getProperty("user");
			String password=prop.getProperty("password");
			queryToGetAllRec=prop.getProperty("queryToGetAllRec");
			queryToPlayRandomSong=prop.getProperty("queryToPlayRandomSong");
			queryToPlayParticularSong=prop.getProperty("queryToPlayParticularSong");
			queryToInsertSong=prop.getProperty("queryToInsertSong");
			queryToUpdateSong=prop.getProperty("queryToUpdateSong");
			queryToDeleteSong=prop.getProperty("queryToDeleteSong");
			
			conn=DriverManager.getConnection(dbUrl, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<MusicBean> getAllMusic() {
		List<MusicBean> musicList=new ArrayList<MusicBean>();
		Statement stmt=null;
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(queryToGetAllRec);
			while(rs.next()) {
				MusicBean music=new MusicBean();
				music.setSongId(rs.getInt("song_id"));
				music.setAlbumName(rs.getString("album_name"));
				music.setSongTitle(rs.getString("song_title"));
				music.setArtistName(rs.getString("artist_name"));
				music.setSongLocation(rs.getString("song_location"));
				music.setDescription(rs.getString("description"));
				musicList.add(music);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return musicList;
	}

	@Override
	public MusicBean getRandomMusic() {
		Random random=new Random();
		int rand=random.nextInt(5)+1;
		MusicBean music=new MusicBean();
		try {
			PreparedStatement pstmt=conn.prepareStatement(queryToPlayRandomSong);
			pstmt.setInt(1,rand);
			rs=pstmt.executeQuery();
			while(rs.next()) {	
				music.setSongId(rs.getInt("song_id"));
				music.setAlbumName(rs.getString("album_name"));
				music.setSongTitle(rs.getString("song_title"));
				music.setArtistName(rs.getString("artist_name"));
				music.setSongLocation(rs.getString("song_location"));
				music.setDescription(rs.getString("description"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return music;
	}

	@Override
	public MusicBean getParticularMusic(String songTile) {
		PreparedStatement pstmt=null;
		MusicBean music=new MusicBean();
		try {
			 pstmt=conn.prepareStatement(queryToPlayParticularSong);
			 pstmt.setString(1,songTile);
			 rs=pstmt.executeQuery();
			 while(rs.next()) {	
					music.setSongId(rs.getInt("song_id"));
					music.setAlbumName(rs.getString("album_name"));
					music.setSongTitle(rs.getString("song_title"));
					music.setArtistName(rs.getString("artist_name"));
					music.setSongLocation(rs.getString("song_location"));
					music.setDescription(rs.getString("description"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return music;
	}

	@Override
	public void addSong(MusicBean music) {
		//queryToInsertSong
		try(PreparedStatement pstmt=conn.prepareStatement(queryToInsertSong)) {
			pstmt.setInt(1,music.getSongId());
			pstmt.setString(2,music.getSongTitle());
			pstmt.setString(3,music.getArtistName());
			pstmt.setString(4,music.getAlbumName());
			pstmt.setString(5,music.getSongLocation());
			pstmt.setString(6, music.getDescription());
			int count=pstmt.executeUpdate();
			if(count>0) {
				System.out.println("Song Added successfully");
			}else {
				System.out.println("Song not Added..");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
	}

	@Override
	public void updateSong(MusicBean music) {
		try(PreparedStatement pstmt=conn.prepareStatement(queryToUpdateSong)) {
			pstmt.setString(1,music.getSongTitle());
			pstmt.setInt(2,music.getSongId());
			int count=pstmt.executeUpdate();
			if(count>0) {
				System.out.println("Song updated.");
			}else {
				System.out.println("Song not updated..");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	@Override
	public void deleteSong(int songId) {
		try(PreparedStatement pstmt=conn.prepareStatement(queryToDeleteSong)) {
			pstmt.setInt(1,songId);
			int count=pstmt.executeUpdate();
			if(count>0) {
				System.out.println("Song deleted.");
			}else {
				System.out.println("Song not deleted.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		if(conn!=null) {
			conn.close();
		}
	}

}
