import java.util.*;

public class Problem345Another{
	public static void main(String[] args) {
		Problem345Another p=new Problem345Another();
		String ans=p.reverseVowels("aA");	
		System.out.println(ans);
	}

	public String reverseVowels(String s) {
	String vowels="aeiouAEIOU";
	int start=0;
	char[] c2=s.toCharArray();
	int end=s.length()-1;
	while(start<end){

		while(start<end && vowels.indexOf(c2[start])==-1){	
			start++;
		}
		while(start<end && vowels.indexOf(c2[end])==-1){
			end--;
		}

		char temp=c2[end];
		c2[end]=c2[start];
		c2[start]=temp;
		
		start++;
		end--;

	}
	
	return new String(c2);
	}
}
