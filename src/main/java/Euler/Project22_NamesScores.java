package Euler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class Project22_NamesScores {

	public static void main(String args[]) {
		File file = new File("C:\\names.txt");

		BufferedReader br;
		String st=null; String[] names=null;
		try {
			br = new BufferedReader(new FileReader(file));
			while ((st = br.readLine()) != null) {
				names = st.split(",");
			}
			Arrays.sort(names);
			for(String s : names) {
				System.out.println(s);
			}
			int sum=0;
			for(int i=0;i<names.length;i++) {
				int numVal=0;
				for(int j=0;j<names[i].length();j++) {
					numVal=numVal+names[i].charAt(j)-'A'+1;
				}
				sum =sum+numVal*(i+1);
			}
			System.out.println(sum);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
