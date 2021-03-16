package InterviewCake.ArraysNStrings;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
public class ExactMovies {
	public static boolean exactMoviesExists(int[] movieLengths, int flightLength){
		Arrays.sort(movieLengths);
		int i=0, j = movieLengths.length-1;
		while(i<j){
			System.out.println(movieLengths[i]+ " : "+movieLengths[j]);
			if(movieLengths[i]+movieLengths[j]==flightLength){
				return true;
			} else if (movieLengths[i]+movieLengths[j]<flightLength){
				i++;
			} else {
				j--;
			}
		}
		return false;
	}
	public static boolean exactMoviesExistsSet(int[] movieLengths, int flightLength){
		Set<Integer> moviesSeen = new HashSet<>();
		for(int i :movieLengths){
			if(moviesSeen.contains(flightLength-i)){
				return true;
			}
			moviesSeen.add(i);
		}
		return false;
	}
	public static void main(String args[]){
		int[] movieLengths = {100,160,200,60,70};
		int flightLength = 160;
		System.out.println("Is there two movies with total length matches to the flight length? " +exactMoviesExistsSet(movieLengths,flightLength));
	}
}