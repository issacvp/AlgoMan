package ch01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {

	public List<Integer> cellCompete(int[] states, int days) {
		List<Integer> result = new ArrayList<>();
		for (int day = 1; day <= days; day++) {
			int arr[] = new int[8];
			for (int i = 0; i < 8; i++) {
				int start = 0, end = 0;
				if (i <= 0) {
					start = 0;
				} else {
					start = states[i - 1];
				}
				if (i >= 7) {
					end = 0;
				} else {
					end = states[i + 1];
				}
				if (start == end) {
					arr[i] = 0;
				} else {
					arr[i] = 1;
				}
			}
			states = arr;
		}
		for (int i : states) {
			result.add(i);
		}
		return result;
	}

	public int generalizedGCD(int num, int[] arr) {
		int gcd = 2, greatest = 2;
		;
		int min = Math.abs(arr[0]);
		for (int i : arr) {
			if (min < Math.abs(i)) {
				min = i;
			}
		}
		while (gcd <= min) {
			boolean allDivisible = true;
			for (int i : arr) {
				if (i % gcd != 0) {
					allDivisible = false;
					break;
				}
			}
			if (allDivisible) {
				greatest = gcd;
			}
			gcd++;
		}
		return greatest;
	}

	public Map<String, Integer> search(List<String> reviews, List<String> names) {
		Map<String, Integer> nameMap = new Hashtable<>();
		for (String name : names) {
			nameMap.put(name.toLowerCase(), 0);
		}
		for (String review : reviews) {
			String[] words = review.split(" ");
			for (String word : words) {
				if (nameMap.containsKey(word.toLowerCase())) {
					nameMap.put(word.toLowerCase(), nameMap.get(word.toLowerCase()) + 1);
				}
			}
		}
		return nameMap;
	}

	public Map<String, Integer> sort(Map<String, Integer> nameMap) {
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(nameMap.entrySet());
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
		for (Entry<String, Integer> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		return sortedMap;

	}

	public ArrayList<String> topNCompetitors(int numCompetitors, int topNCompetitors, List<String> competitors,
			int numReviews, List<String> reviews) {
		Map<String, Integer> nameMap = search(reviews, competitors);
		nameMap = sort(nameMap);
		ArrayList<String> topNames = new ArrayList<>();
		nameMap.forEach((name, value) -> {
			topNames.add(name);
		});
		ArrayList<String> topNames2 = new ArrayList<>();
		if (topNames.size() >= topNCompetitors) {
			for (int i = 0; i < topNCompetitors; i++) {
				topNames2.add(topNames.get(i));
			}
			return topNames2;
		} else
			return topNames;

	}

	int minimumHours(int rows, int columns, List<List<Integer>> grid) {
		int minimumHours = 0;
		int servers[][] = new int[rows][columns];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				servers[i][j] = grid.get(i).get(j);
				
			}
			
		}
		
		return minimumHours;
	}

	public static void main(String args[]) {
		Solution sl = new Solution();
		List<List<Integer>> grid = new ArrayList<>();
		grid.add(Arrays.asList(0,1,1,0,1));
		grid.add(Arrays.asList(0,1,0,1,0));
		grid.add(Arrays.asList(0,0,0,0,1));
		grid.add(Arrays.asList(0,1,0,0,0));
		
		sl.minimumHours(4, 5, grid);
	}
}
