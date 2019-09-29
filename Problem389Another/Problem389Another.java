import java.util.*;
public class Problem389Another{
	public static void main(String[] args) {
		Problem389Another p=new Problem389Another();
		char ans=p.findTheDifference("ae","aed");
		System.out.println(ans);
	}

	
	public char findTheDifference(String s, String t){
		int sAns=t.charAt(t.length()-1);
		//int tAns=0;
		for(int i=0;i<s.length();i++){ 
			sAns-=(int)s.charAt(i);
			sAns+=(int)s.charAt(i);
		}
		return(char)(sAns);	
	}






	/*public char findTheDifference(String s, String t){
		if (s.length()==0) return t.charAt(0);
		int sAns=s.charAt(0)-'a';
		int tAns=t.charAt(0)-'a';

		for(int i=1;i<=s.length();i++){
			if(i!=s.length()) sAns=sAns^(int)(s.charAt(i)-'a');
			tAns=tAns^(int)(t.charAt(i)-'a');
		}

		int temp=tAns;
		char finalAns='$';
		for(int i=0;i<t.length();i++){
			temp=temp^(int)(t.charAt(i)-'a');
			if(temp==sAns){
				finalAns=t.charAt(i);
				break;
			}
			temp=tAns;
		}
		return finalAns;
	}*/
}	