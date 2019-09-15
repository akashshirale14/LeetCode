import java.util.*;
public class Problem890{
	public static void main(String[] args){
		Problem890 p=new Problem890();
		String[] words={"abc","cba","xyx","yxx","yyx"};
		String pattern ="abc";
		List<String>ll=p.findAndReplacePattern(words,pattern);
		System.out.println(ll);
	}
	public List<String> findAndReplacePattern(String[] words, String pattern) {
		List<String>ans=new ArrayList<>();
        for(int i=0;i<words.length;i++){
        	String curr=words[i];
        	int flag=0;
        	if(curr.length()==1 && pattern.length()==1){
        				flag=1;
        	}
        	for(int j=0;j<curr.length()-1;j++){
        		if(pattern.length()!=curr.length()){
        			break;
        		}else{
        		 if(curr.charAt(j)==curr.charAt(j+1) && pattern.charAt(j)==pattern.charAt(j+1)){
        				flag=1;
        			}else if(curr.charAt(j)!=curr.charAt(j+1) && pattern.charAt(j)!=pattern.charAt(j+1)){
        				flag=1;
        			}else{
        				flag=0;
        				break;
        			}
        		}
        	}
        	if(flag==1){ans.add(curr);}
        }
    	
    	return ans;
    }

}