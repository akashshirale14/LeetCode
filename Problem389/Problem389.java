import java.util.*;
public class Problem389{
	public static void main(String[] args) {
		Problem389 p=new Problem389();
		char ans=p.findTheDifference("abcdghfed","abcdeghd");
		System.out.println(ans);
	}
	public char findTheDifference(String s, String t) {
        int[] forSarray=new int[26];
        int[] forTarray=new int[26];

        for(int i=0;i<s.length();i++){
        	char curr=s.charAt(i);
        	forSarray[curr-'a']+=1;
        }
        for(int i=0;i<t.length();i++){
        	char curr=t.charAt(i);
        	forTarray[curr-'a']+=1;
        }
        int i;
        for( i=0;i<forTarray.length;i++){
        	if(forTarray[i]!=forSarray[i]) break;
        }

        return (char)('a'+i);
    }
}