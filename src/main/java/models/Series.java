package main.java.models;

import java.util.List;

public class Series {

	private String seriesName;
	private List<Season> seasons;

	public Series(String seriesName) {
		super();
		this.seriesName = seriesName;
	}
		
	public String getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public int getNumberOfSeasons() {
		return seasons.size();
	}


	public void addSeason(Season season) {
		this.seasons.add(season);
	}

	public List<Season> getSeasons() {
		return seasons;
	}

	public void setSeasons(List<Season> seasons) {
		this.seasons = seasons;
	}
	
}
