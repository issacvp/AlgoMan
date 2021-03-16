package CodingBat;
public class StringYak {

	public String stringYak(String str) {
		StringBuffer string = new StringBuffer(str);
		int i=0;
		for( i=0; i+3 < string.length();i++) {
			if(string.charAt(i)=='y' && string.substring(i, i+3).equalsIgnoreCase("yak")) {
				string.delete(i, i+3);
			}
		}
		if(i<string.length() && string.substring(i).equalsIgnoreCase("yak")){
		  string.delete(i,string.length());
		}
		return string.toString();
}

	public static void main(String[] args) {
		System.out.println(new StringYak().stringYak("yakPaky"));

	}

}
