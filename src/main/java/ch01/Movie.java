package ch01;

import lombok.Data;

@Data
public class Movie {
	private String name;
	private int start;
	private int stop;
	public Movie(String name, int start, int stop) {
		super();
		this.name = name;
		this.start = start;
		this.stop = stop;
	}
}
