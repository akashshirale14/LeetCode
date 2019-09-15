import java.util.*;
public class Problem890Another{
	public static void main(String[] args){
		Problem890Another p=new Problem890Another();
		String[] words={"abc","cba","xyx","yxx","yyx"};
		String pattern ="abc";
		List<String>ll=p.findAndReplacePattern(words,pattern);
		System.out.println(ll);
	}

	public List<String> findAndReplacePattern(String[] words, String pattern) {
		List<String>ans=new ArrayList<>();
		int[] pa=new int[26];
        for(int i=0;i<pattern.length();i++){
        	char curr=pattern.charAt(i);
        	pa[curr%97]++;
        }
        for(int i=0;i<words.length;i++){
        	if(words[i].length()!=pattern.length()){
        		continue;
        	}else{
        		String co=words[i];
        		int[]temp=new int[26];
        		for(int j=0;j<co.length();j++){
        			char curr=co.charAt(i);
        			temp[curr%97]++;
        		}
        	}
        }



    }

}