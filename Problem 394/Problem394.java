import java.util.*;
public class Problem394{
	public static void main(String[] args){
		Problem394 p=new Problem394();
		String ans=p.decodeString("3[a2[c]]");
		System.out.println(ans);
	}

	public String decodeString(String s) {
        int len=s.length();
        int i=0;
        char now;
        String ans="";
        while(i<len){
        	StringBuilder curr=new StringBuilder();
        	 now=s.charAt(i);
        	while(now!='['){
        		curr.append(now);
        		i++;
        		 now=s.charAt(i);
        	}
        	String gg=curr.toString();
        	int num=Integer.parseInt(gg);
        	i++;
        	now=s.charAt(i);
        	StringBuilder xx=new StringBuilder();
        	while(now!=']'){
        		xx.append(now);
        		i++;
        		now=s.charAt(i);
        	}
        	String ll=xx.toString();
        	for(int k=0;k<num;k++){
        		ans+=ll;
        	}
        	i++;
        }

        return ans;
    }

}