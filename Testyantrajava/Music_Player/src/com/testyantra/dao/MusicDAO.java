package com.testyantra.dao;

import java.util.List;

import com.testyantra.music.bean.MusicBean;

public interface MusicDAO {
	public List<MusicBean> getAllMusic();
	public MusicBean getRandomMusic();
	public MusicBean getParticularMusic(String songTile);
	public void addSong(MusicBean music);
	public void updateSong(MusicBean music);
	public void deleteSong(int songId);
}
