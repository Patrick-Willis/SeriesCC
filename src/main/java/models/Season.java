package main.java.models;

import java.util.List;

public class Season {
	
	private int season;
	private List<Episode> episodes;
	
	public Season(int season) {
		super();
		this.season = season;
	}

	public int getSeason() {
		return season;
	}

	public void setSeason(int season) {
		this.season = season;
	}

	public List<Episode> getEpisodes() {
		return episodes;
	}

	public void setEpisodes(List<Episode> episodes) {
		this.episodes = episodes;
	}
	
	public int getNumberOfEpisodes() {
		return episodes.size();
	}


	public void addEpisode(Episode episode) {
		this.episodes.add(episode);
	}

	
}
