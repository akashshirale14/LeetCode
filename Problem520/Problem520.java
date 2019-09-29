import java.util.*;
public class Problem520{
	public static void main(String[] args) {
		Problem520 p=new Problem520();
		boolean ans=p.detectCapitalUse("Facebook");
		System.out.println(ans);	

	}
	public boolean detectCapitalUse(String word) {
		int flag=1;
        if(word.length()==1) return true;
        int firstCapital=0;
         if(word.charAt(0)-'a'<0){
         	System.out.println("here");
         	firstCapital=1;
         }
    	for(int i=1;i<word.length();i++){
    		if(firstCapital==0){
    			if(word.charAt(i)-'a'<0){
    				flag=0;
    				return false;
    			}
    		}else{
    			System.out.println("!");
    			if(word.charAt(i)-'a'<0 && word.charAt(i-1)-'a'<0 && i!=1){
    				System.out.println("All big");
    				flag=1;
    				continue;
    			}else if(word.charAt(i)-'a'>=0 && word.charAt(i-1)-'a'>=0 && i!=1){
    				System.out.println("One big other small");
    			 	flag=1;
    				continue;
    			}else{
    				System.out.println(i);
    				if(i!=1){
    				flag=0;
    				break;
    			}
    			}
    		}
    	}
    	if(flag!=1) return false;
    	return true;
    }

}