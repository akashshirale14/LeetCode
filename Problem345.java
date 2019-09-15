import java.util.*;

public class Problem345{
	public static void main(String[] args) {
		Problem345 p=new Problem345();
		String ans=p.reverseVowels("aA");	
		System.out.println(ans);
	}
	 public String reverseVowels(String s) {
        char[] letters=s.toCharArray();
        char[] vowels=new char[s.length()];
        int[] index=new int[s.length()];
        int j=-1;
        int k=0;
        int flag=0;
        for(int i=0;i<letters.length;i++){
        	if(letters[i]=='a' || letters[i]=='A' || letters[i]=='E' || letters[i]=='I' || letters[i]=='O' || letters[i]=='U'|| letters[i]=='e' || letters[i]=='i'||letters[i]=='o'||letters[i]=='u'){
        		j++;
        		flag=1;
        		vowels[j]=letters[i];
        		index[j]=i;
        	}
        }
        if(flag==1){
        	for(int t=j;t>=0;t--){
        		char c=vowels[t];
        		int uu=index[k];
        		letters[uu]=c;
        		k++;
        	}
        }

        String ans="";
        for(int i=0;i<letters.length;i++){
        	ans+=String.valueOf(letters[i]);
        }

        return ans;
    }
}