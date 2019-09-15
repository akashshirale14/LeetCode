import java.util.*;

public class Problem557{
	public static void main(String[] args){
	Problem557 p=new Problem557();
	String ans=p.reverseWords("Let's take LeetCode contest");
	System.out.println(ans);
	}


	 public String reverseWords(String s) {
        String ans="";
        String now="";
        int flag=0;
        for(int i=0;i<s.length();i++){
        	char curr=s.charAt(i);
        	if(curr!=' '){
        		ans=String.valueOf(curr)+ans;
        	}else{
        		now+=ans+String.valueOf(curr);
        		ans="";
        	}
        }
        return now+ans;
    }
}