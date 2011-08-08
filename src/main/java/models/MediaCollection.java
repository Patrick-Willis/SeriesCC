package main.java.models;

import java.util.List;
import java.io.File;

public class MediaCollection {

	private List<Series> series;

	public MediaCollection() {
		super();
	}

	public void populateSeries()
	{
		java.io.File file = new File("G:\\Test");
		System.out.println(file.list());
	}
	
}
