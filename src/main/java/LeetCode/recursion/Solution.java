package LeetCode.recursion;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list = new ArrayList<>();
		return generate(list, numRows);
	}

	public List<List<Integer>> generate(List<List<Integer>> list, int numRows) {
		if (numRows == 0) {
			return list;
		}
		if (numRows == 1) {
			List<Integer> listInt = new ArrayList<>();
			listInt.add(1);
			list.add(listInt);
			return list;
		}
		generate(list,numRows-1);
		List<Integer> newList = new ArrayList<>();
		newList.add(1);
		for(int i=1;i<list.get(numRows-2).size();i++) {
			newList.add(list.get(numRows - 2).get(i-1) + list.get(numRows - 2).get(i));
		}
		newList.add(1);
		list.add(newList);
		return list;
	}
	public List<Integer> getRow(int rowIndex){
		List<Integer> list = new ArrayList<>();
		return getRow(list, rowIndex);
	}
	public List<Integer> getRow(List<Integer> list, int numRows){
		if(numRows==0) {
			list.add(1);
			return list;
		} 
		list = getRow(list,numRows-1);
		List<Integer> newList = new ArrayList<>();
		newList.add(1);
		for(int i=1;i<list.size();i++) {
			newList.add(list.get(i-1) + list.get(i));
		}
		newList.add(1);
		return newList;
	}
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println("Hai");
		/*
		 * List<List<Integer>> list = s.generate(5); for(List<Integer> listInt:list) {
		 * for(int i:listInt) { System.out.print(i+"\t"); } System.out.println(""); }
		 */		
		System.out.println(s.getRow(4));
	}
	

}
