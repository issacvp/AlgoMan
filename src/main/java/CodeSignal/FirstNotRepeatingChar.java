package CodeSignal;

public class FirstNotRepeatingChar {

	public char firstNotRepeatingCharacter(String s) {
	    if(s==null || s.length()<2){
	        return '_';
	    } else {
	        
	        boolean[] mem = new boolean[26];
	        int[] firstLoc = new int[26];
	        boolean[] seen = new boolean[s.length()];
	        for(int i=0;i<s.length();i++){
	            if(mem[s.charAt(i)-97]){
	            	seen[i]=true;
	                seen[firstLoc[s.charAt(i)-97]]=true;
	            }
	            mem[s.charAt(i)-97]=true;
	            if(firstLoc[s.charAt(i)-97]==0) {
	            	firstLoc[s.charAt(i)-97]=i;
	            }
	        }
	        for(int i=0;i<s.length();i++){
	            if(seen[i]==false){
	                return s.charAt(i);
	            }
	        }
	        return '_';
	    }
	    
	}
	public static void main(String args[]) {
		FirstNotRepeatingChar ch = new FirstNotRepeatingChar();
		System.out.println(ch.firstNotRepeatingCharacter("abacabaabacaba"));
	}
}
