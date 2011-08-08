package main.java.models;

public class Episode {

	private int episode;
	private String episodeTitle;

	public Episode(int episode, String episodeTitle) {
		super();
		this.episode = episode;
		this.episodeTitle = episodeTitle;
	}

	public int getEpisode() {
		return episode;
	}

	public void setEpisode(int episode) {
		this.episode = episode;
	}

	public String getEpisodeTitle() {
		return episodeTitle;
	}

	public void setEpisodeTitle(String episodeTitle) {
		this.episodeTitle = episodeTitle;
	}
}
