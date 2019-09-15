import java.util.*;
public class Problem1160{
	public static void main(String[] args){
		Problem1160 p=new Problem1160();
		String[] words={"skwg","uf","tco","qwp","vbtv"};
		String chars="avyteswqppomeojxoybotzriuvxolmllevluauwb";
		int sum=p.countCharacters(words,chars);
		System.out.println(sum);
	}
	public int countCharacters(String[]words,String chars) {
        int[] finalString=new int[26];
        int sum=0;
        for(int i=0;i<chars.length();i++){
        	char curr=chars.charAt(i);
        	int cc=curr%97;
        	System.out.println(cc);
        	finalString[cc]+=1;
        }
        for(int j=0;j<words.length;j++){
        	String now=words[j];
        	int[] temp=new int[25];
			for(int i=0;i<now.length();i++){
				char curr=now.charAt(i);
				int cc=curr%97;
        			temp[cc]+=1;
			} 
			int flag=0;
			for(int i=0;i<temp.length;i++){
				if(temp[i]>finalString[i]){
					flag=1;
					break;
				}
			}
		if(flag==0) sum+=now.length();

        }        

        return sum;
    }
}