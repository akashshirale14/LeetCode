import java.util.*;
public class Problem1002Another{
	public static void main(String[] args){
		Problem1002Another p=new Problem1002Another();
		String[] A={"bella","label","roller"};
		List<String>ll=p.commonChars(A);
		System.out.println(ll);
	}
	public List<String> commonChars(String[] A) {
		List<String> ans=new ArrayList<>();
		int[] first=new int[26];
		for(int i=0;i<A[0].length();i++){
			char curr=A[0].charAt(i);
			first[curr-'a']++;
		}
		for(int i=1;i<A.length;i++){
			String present=A[i];
			int[] other=new int[26];
			for(int j=0;j<present.length();j++){
				char curr=present.charAt(j);
				other[curr-'a']++;
			}
			for(int j=0;j<26;j++){
				if(first[j]>other[j]) first[j]=other[j];
			}
		}

		for(int i=0;i<26;i++){
			for(int j=0;j<first[i];j++){
				ans.add(String.valueOf((char)('a'+i)));
			}
		}

		return ans;
}
	}