import java.util.*;

public class Problem1078{
	public static void main(String[] args){
		Problem1078 p=new Problem1078();
		String[] a=p.findOcurrences("we will we will rock you", "we","will");
		for(int i=0;i<a.length;i++){
		System.out.print(a[i]);
		}
	}
	   public String[] findOcurrences(String text, String first, String second) {
        String[] curr=text.split(" ");
        String ans="";
        for(int i=0;i<curr.length-1;i++){
        	if(curr[i].compareTo(first)==0 && curr[i+1].compareTo(second)==0){
        		if(i+1!=curr.length-1){
        			if(ans.compareTo("")==0){
        				ans=ans+curr[i+2];
        			}else{
        			ans=ans+" "+curr[i+2];
        		}
        		}
        	}
        }
        
        String[] finalAns=ans.split(" ");
        return finalAns;
    }
}