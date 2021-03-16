package ch01;

import java.util.ArrayList;
import java.util.List;

public class MoviesRightJob {

	public boolean[] findRightJobEarliestJobFirst(List<Movie> movies){
		boolean accepted[] = new boolean[movies.size()];
		accepted[0] = true;
		int i=0,j=0;
		while(i < movies.size()-1) {
			j=i+1;
			int minDistance = movies.get(j).getStart() - movies.get(i).getStop();
			int minPos = i;
			while(j<movies.size()) {
				if(accepted[j]) {
					j++;
					continue;
				} else {
					int distance = movies.get(j).getStart() - movies.get(i).getStop();
					if(distance > 0 && minDistance > distance) {
						minDistance = distance;
						minPos = j;
					}
					j++;
				}
			}
			if(minPos>i) {
				i = minPos;
				accepted[minPos] = true;
			} else {
				
			}
		}
		return accepted;
	}
	
	public static void main(String args[]) {
		MoviesRightJob scheduler = new MoviesRightJob();
		List<Movie> movies = new ArrayList<>();
		movies.add(new Movie("The President's Algorist", 30, 430));
		movies.add(new Movie("Discrete Mathematics", 76, 338));
		movies.add(new Movie("Tarjan of the Jungle", 185, 540));
		movies.add(new Movie("Halting State", 423, 649));
		movies.add(new Movie("Steiner's Tree", 496, 716));
		movies.add(new Movie("The four volume problem", 681, 1094));
		movies.add(new Movie("Programming challenges ", 998	, 1364));
		movies.add(new Movie("Process Termintated", 1082, 1380));
		boolean schedule [] = scheduler.findRightJobEarliestJobFirst(movies);
		for(int i=0; i<movies.size();i++) {
			if(schedule[i]) {
				System.out.print(movies.get(i).getName()+" -> ");
			}
		}
	}
	
}
